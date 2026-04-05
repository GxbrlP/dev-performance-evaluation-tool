package com.tcc.evaluation.tool.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.evaluation.tool.auth.dto.CreateDeveloperCompetencyRequest;
import com.tcc.evaluation.tool.auth.dto.DeveloperCompetencyResponse;
import com.tcc.evaluation.tool.service.CompetencyService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/competencies")
@RequiredArgsConstructor
public class CompetencyController {

    private final CompetencyService service;

    @PostMapping("/evaluate")
    public void evaluate(@RequestBody CreateDeveloperCompetencyRequest request) {
        service.evaluate(request);
    }

    @GetMapping("/developer/{id}")
    public List<DeveloperCompetencyResponse> getByDeveloper(@PathVariable Long id) {
        return service.getByDeveloper(id);
    }
}
