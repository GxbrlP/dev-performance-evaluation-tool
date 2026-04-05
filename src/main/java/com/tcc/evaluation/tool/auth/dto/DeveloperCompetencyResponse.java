package com.tcc.evaluation.tool.auth.dto;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class DeveloperCompetencyResponse {

    private String competencyName;

    private String type;

    private Integer level;

    private String feedback;
}  
