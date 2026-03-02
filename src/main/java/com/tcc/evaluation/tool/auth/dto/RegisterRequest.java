package com.tcc.evaluation.tool.auth.dto;

import com.tcc.evaluation.tool.model.Role;

import lombok.Data;

@Data
public class RegisterRequest {
    private String name;
    private String email;
    private String password;
    private Role role;
}