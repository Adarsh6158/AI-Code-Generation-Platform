package com.adarshcodes.project.ai_driven_app_builder.service;

import com.adarshcodes.project.ai_driven_app_builder.dto.auth.AuthResponse;
import com.adarshcodes.project.ai_driven_app_builder.dto.auth.LoginRequest;
import com.adarshcodes.project.ai_driven_app_builder.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
