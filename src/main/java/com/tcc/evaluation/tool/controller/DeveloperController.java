package com.tcc.evaluation.tool.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.evaluation.tool.auth.dto.CreateDeveloperRequest;
import com.tcc.evaluation.tool.model.Developer;
import com.tcc.evaluation.tool.service.DeveloperService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/developers")
@RequiredArgsConstructor
public class DeveloperController {

    private final DeveloperService service;

    @PostMapping
    public Developer create(@RequestBody CreateDeveloperRequest request) {
        return service.create(request);
    }

    @GetMapping
    public List<Developer> list() {
        return service.findAll();
    }
}
