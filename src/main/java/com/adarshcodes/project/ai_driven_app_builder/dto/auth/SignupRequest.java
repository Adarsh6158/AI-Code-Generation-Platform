package com.adarshcodes.project.ai_driven_app_builder.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
