package com.ciecc.fire.ws.web.controller;

import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.annotation.SendToUser;

@Controller
public class MyController {

	@MessageMapping("/action")
	public void handleAction() throws Exception {
		// raise MyBusinessException here
	}

	@MessageExceptionHandler
	@SendToUser(destinations = "/queue/errors", broadcast = false)
	public ApplicationError handleException(MyBusinessException exception) {
		// ...
		return appError;
	}
}
