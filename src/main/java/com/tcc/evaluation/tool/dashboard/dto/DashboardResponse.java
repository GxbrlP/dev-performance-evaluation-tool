package com.tcc.evaluation.tool.dashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DashboardResponse {

    private long totalDevelopers;

    private long totalTeams;

    private long totalRepositories;

}
