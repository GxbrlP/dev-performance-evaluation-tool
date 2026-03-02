package com.tcc.evaluation.tool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcc.evaluation.tool.model.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
