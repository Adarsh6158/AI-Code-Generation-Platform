package com.adarshcodes.project.ai_driven_app_builder.service;

import com.adarshcodes.project.ai_driven_app_builder.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
