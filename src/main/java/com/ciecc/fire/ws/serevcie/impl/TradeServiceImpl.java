package com.ciecc.fire.ws.serevcie.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import com.ciecc.fire.ws.serevcie.TradeService;

public class TradeServiceImpl implements TradeService {

	private final SimpMessagingTemplate messagingTemplate;

	@Autowired
	public TradeServiceImpl(SimpMessagingTemplate messagingTemplate) {
		this.messagingTemplate = messagingTemplate;
	}

	// ...

	public void afterTradeExecuted(Trade trade) {
		this.messagingTemplate.convertAndSendToUser(trade.getUserName(), "/queue/position-updates", trade.getResult());
	}
}
