package com.adarshcodes.project.ai_driven_app_builder.dto.member;

import com.adarshcodes.project.ai_driven_app_builder.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt
) {
}
