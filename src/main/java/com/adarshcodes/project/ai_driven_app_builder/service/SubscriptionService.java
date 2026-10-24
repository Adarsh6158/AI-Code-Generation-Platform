package com.adarshcodes.project.ai_driven_app_builder.service;

import com.adarshcodes.project.ai_driven_app_builder.dto.subscription.CheckoutRequest;
import com.adarshcodes.project.ai_driven_app_builder.dto.subscription.CheckoutResponse;
import com.adarshcodes.project.ai_driven_app_builder.dto.subscription.PortalResponse;
import com.adarshcodes.project.ai_driven_app_builder.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
