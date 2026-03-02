package com.tcc.evaluation.tool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcc.evaluation.tool.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}