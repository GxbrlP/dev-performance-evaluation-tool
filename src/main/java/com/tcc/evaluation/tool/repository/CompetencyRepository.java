package com.tcc.evaluation.tool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcc.evaluation.tool.model.Competency;

public interface CompetencyRepository extends JpaRepository<Competency, Long> {
    
}
