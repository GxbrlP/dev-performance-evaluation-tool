package com.tcc.evaluation.tool.dashboard;

import com.tcc.evaluation.tool.dashboard.dto.DashboardResponse;
import com.tcc.evaluation.tool.repository.DeveloperRepository;
import com.tcc.evaluation.tool.repository.TeamRepository;
import com.tcc.evaluation.tool.repository.GitRepositoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DashboardService {

    private final DeveloperRepository developerRepository;
    private final TeamRepository teamRepository;
    private final GitRepositoryRepository repositoryRepository;

    public DashboardResponse getDashboard() {

        long totalDevelopers = developerRepository.count();
        long totalTeams = teamRepository.count();
        long totalRepositories = repositoryRepository.count();

        return new DashboardResponse(
                totalDevelopers,
                totalTeams,
                totalRepositories
        );
    }

}