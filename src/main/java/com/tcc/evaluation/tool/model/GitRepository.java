package com.tcc.evaluation.tool.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "git_repositories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GitRepository {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(nullable = false)
    private String url;

    private String provider; // GITLAB ou GITHUB futuramente
}
