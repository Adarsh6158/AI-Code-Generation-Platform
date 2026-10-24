package com.adarshcodes.project.ai_driven_app_builder.service.impl;

import com.adarshcodes.project.ai_driven_app_builder.dto.auth.UserProfileResponse;
import com.adarshcodes.project.ai_driven_app_builder.dto.subscription.PlanLimitsResponse;
import com.adarshcodes.project.ai_driven_app_builder.dto.subscription.UsageTodayResponse;
import com.adarshcodes.project.ai_driven_app_builder.service.UsageService;
import com.adarshcodes.project.ai_driven_app_builder.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {

    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
