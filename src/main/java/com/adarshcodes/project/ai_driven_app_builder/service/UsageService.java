package com.adarshcodes.project.ai_driven_app_builder.service;

import com.adarshcodes.project.ai_driven_app_builder.dto.subscription.PlanLimitsResponse;
import com.adarshcodes.project.ai_driven_app_builder.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
