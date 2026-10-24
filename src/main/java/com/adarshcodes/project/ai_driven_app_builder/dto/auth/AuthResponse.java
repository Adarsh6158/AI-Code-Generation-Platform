package com.adarshcodes.project.ai_driven_app_builder.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {

}
