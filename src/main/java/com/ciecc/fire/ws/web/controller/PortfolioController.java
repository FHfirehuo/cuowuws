package com.ciecc.fire.ws.web.controller;

import java.security.Principal;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

@Controller
public class PortfolioController {

	@MessageMapping("/trade")
	@SendToUser("/queue/position-updates")
	public TradeResult executeTrade(Trade trade, Principal principal) {
		return tradeResult;
	}
}
