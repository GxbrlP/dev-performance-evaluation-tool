package com.tcc.evaluation.tool.auth.dto;

import com.tcc.evaluation.tool.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserMeResponse {
    private Long id;

    private String name;

    private String email;

    private Role role;

}
