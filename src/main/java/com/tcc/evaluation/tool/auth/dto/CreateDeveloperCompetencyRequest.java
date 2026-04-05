package com.tcc.evaluation.tool.auth.dto;

import lombok.Data;

@Data
public class CreateDeveloperCompetencyRequest {

    private Long developerId;

    private Long competencyId;

    private Integer level;

    private String feedback;
}
