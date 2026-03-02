package com.tcc.evaluation.tool.auth.dto;

import lombok.Data;

@Data
public class CreateDeveloperRequest {
    private String name;
    private String email;
    private Long teamId;
}
