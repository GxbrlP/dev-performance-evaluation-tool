package com.tcc.evaluation.tool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tcc.evaluation.tool.model.GitRepository;

public interface GitRepositoryRepository extends JpaRepository<GitRepository, Long> {}
