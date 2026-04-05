package com.tcc.evaluation.tool.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "developer_competencies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeveloperCompetency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "developer_id")
    private Developer developer;

    @ManyToOne
    @JoinColumn(name = "competency_id")
    private Competency competency;

    private Integer level; // 1 a 5

    private String feedback;

}