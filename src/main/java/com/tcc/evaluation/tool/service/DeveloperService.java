package com.tcc.evaluation.tool.service;

import java.util.List;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import com.tcc.evaluation.tool.auth.dto.CreateDeveloperRequest;
import com.tcc.evaluation.tool.model.Developer;
import com.tcc.evaluation.tool.model.Team;
import com.tcc.evaluation.tool.repository.DeveloperRepository;
import com.tcc.evaluation.tool.repository.TeamRepository;

@Service
@RequiredArgsConstructor
public class DeveloperService {

    private final DeveloperRepository repository;
    private final TeamRepository teamRepository;

    public Developer create(CreateDeveloperRequest request) {

        Team team = teamRepository.findById(request.getTeamId())
                .orElseThrow();

        Developer developer = Developer.builder()
                .name(request.getName())
                .email(request.getEmail())
                .team(team)
                .build();

        return repository.save(developer);
    }

    public List<Developer> findAll() {
        return repository.findAll();
    }
}