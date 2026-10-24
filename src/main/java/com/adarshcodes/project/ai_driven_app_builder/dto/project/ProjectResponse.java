package com.adarshcodes.project.ai_driven_app_builder.dto.project;

import com.adarshcodes.project.ai_driven_app_builder.dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}
