package com.adarshcodes.project.ai_driven_app_builder.service.impl;

import com.adarshcodes.project.ai_driven_app_builder.dto.auth.AuthResponse;
import com.adarshcodes.project.ai_driven_app_builder.dto.auth.LoginRequest;
import com.adarshcodes.project.ai_driven_app_builder.dto.auth.SignupRequest;
import com.adarshcodes.project.ai_driven_app_builder.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
