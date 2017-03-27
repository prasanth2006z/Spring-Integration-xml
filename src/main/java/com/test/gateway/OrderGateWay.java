package com.test.gateway;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.stereotype.Component;

import com.test.model.Order;

@Component
@MessagingGateway
public interface OrderGateWay {
	@Gateway(requestChannel = "orderGateWayChannel")
	public void placeOrder(Order order);
}
