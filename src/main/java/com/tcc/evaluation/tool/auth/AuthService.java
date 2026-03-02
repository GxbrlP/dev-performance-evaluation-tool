package com.tcc.evaluation.tool.auth;

import com.tcc.evaluation.tool.auth.dto.*;
import com.tcc.evaluation.tool.model.User;
import com.tcc.evaluation.tool.repository.UserRepository;
import com.tcc.evaluation.tool.security.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository repository;
    private final PasswordEncoder encoder;
    private final JwtService jwtService;
    private final AuthenticationManager authManager;

    public AuthResponse register(RegisterRequest request) {

        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(encoder.encode(request.getPassword()))
                .role(request.getRole())
                .build();

        repository.save(user);

        String token = jwtService.generateToken(user.getEmail());

        return new AuthResponse(token);
    }

    public AuthResponse login(LoginRequest request) {

        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );

        User user = repository.findByEmail(request.getEmail())
                .orElseThrow();

        String token = jwtService.generateToken(user.getEmail());

        return new AuthResponse(token);
    }
}
