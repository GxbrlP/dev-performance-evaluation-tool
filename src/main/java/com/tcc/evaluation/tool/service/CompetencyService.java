package com.tcc.evaluation.tool.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tcc.evaluation.tool.auth.dto.CreateDeveloperCompetencyRequest;
import com.tcc.evaluation.tool.auth.dto.DeveloperCompetencyResponse;
import com.tcc.evaluation.tool.model.Competency;
import com.tcc.evaluation.tool.model.Developer;
import com.tcc.evaluation.tool.model.DeveloperCompetency;
import com.tcc.evaluation.tool.repository.CompetencyRepository;
import com.tcc.evaluation.tool.repository.DeveloperCompetencyRepository;
import com.tcc.evaluation.tool.repository.DeveloperRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CompetencyService {

    private final DeveloperRepository developerRepository;
    private final CompetencyRepository competencyRepository;
    private final DeveloperCompetencyRepository devCompRepository;

    public void evaluate(CreateDeveloperCompetencyRequest request) {

        Developer dev = developerRepository.findById(request.getDeveloperId())
                .orElseThrow();

        Competency comp = competencyRepository.findById(request.getCompetencyId())
                .orElseThrow();

        DeveloperCompetency entity = DeveloperCompetency.builder()
                .developer(dev)
                .competency(comp)
                .level(request.getLevel())
                .feedback(request.getFeedback())
                .build();

        devCompRepository.save(entity);
    }

    public List<DeveloperCompetencyResponse> getByDeveloper(Long developerId) {

        return devCompRepository.findAll().stream()
                .filter(dc -> dc.getDeveloper().getId().equals(developerId))
                .map(dc -> new DeveloperCompetencyResponse(
                        dc.getCompetency().getName(),
                        dc.getCompetency().getType().name(),
                        dc.getLevel(),
                        dc.getFeedback()
                ))
                .toList();
    }
}
