package com.adarshcodes.project.ai_driven_app_builder.service.impl;

import com.adarshcodes.project.ai_driven_app_builder.dto.subscription.CheckoutRequest;
import com.adarshcodes.project.ai_driven_app_builder.dto.subscription.CheckoutResponse;
import com.adarshcodes.project.ai_driven_app_builder.dto.subscription.PortalResponse;
import com.adarshcodes.project.ai_driven_app_builder.dto.subscription.SubscriptionResponse;
import com.adarshcodes.project.ai_driven_app_builder.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
