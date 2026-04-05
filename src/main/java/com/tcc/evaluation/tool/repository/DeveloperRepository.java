package com.tcc.evaluation.tool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tcc.evaluation.tool.model.Developer;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {
    
}
