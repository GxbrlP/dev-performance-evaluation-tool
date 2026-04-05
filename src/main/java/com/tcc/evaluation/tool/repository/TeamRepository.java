package com.tcc.evaluation.tool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tcc.evaluation.tool.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
    
}
