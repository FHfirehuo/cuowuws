package com.ciecc.fire.ws.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetingController {

	@MessageMapping("/greeting")
	public String handle(String greeting) {
		return "[" + getTimestamp() + ": " + greeting;
	}

	private SimpMessagingTemplate template;

	@Autowired
	public GreetingController(SimpMessagingTemplate template) {
		this.template = template;
	}

	@RequestMapping(path = "/greetings", method = RequestMethod.POST)
	public void greet(String greeting) {
		String text = "[" + getTimestamp() + "]:" + greeting;
		this.template.convertAndSend("/topic/greetings", text);
	}
}
