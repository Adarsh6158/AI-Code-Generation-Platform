package com.adarshcodes.project.ai_driven_app_builder.dto.subscription;

public record UsageTodayResponse(
        int tokensUsed,
        int tokensLimit,
        int previewsRunning,
        int previewsLimit
) {
}
