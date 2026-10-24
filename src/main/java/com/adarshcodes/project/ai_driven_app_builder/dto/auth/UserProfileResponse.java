package com.adarshcodes.project.ai_driven_app_builder.dto.auth;

public record UserProfileResponse(
        Long id,
        String email,
        String name,
        String avatarUrl
) {
}
