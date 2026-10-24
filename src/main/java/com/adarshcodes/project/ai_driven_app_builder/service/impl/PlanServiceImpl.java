package com.adarshcodes.project.ai_driven_app_builder.service.impl;

import com.adarshcodes.project.ai_driven_app_builder.dto.subscription.PlanResponse;
import com.adarshcodes.project.ai_driven_app_builder.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
