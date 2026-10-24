package com.adarshcodes.project.ai_driven_app_builder.service;

import com.adarshcodes.project.ai_driven_app_builder.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
