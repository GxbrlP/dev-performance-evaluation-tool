package com.tcc.evaluation.tool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcc.evaluation.tool.model.DeveloperCompetency;

public interface DeveloperCompetencyRepository extends JpaRepository<DeveloperCompetency, Long> {
    
}
