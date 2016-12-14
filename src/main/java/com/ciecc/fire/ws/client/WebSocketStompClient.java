package com.ciecc.fire.ws.client;

import org.springframework.messaging.simp.stomp.StompSessionHandler;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;

import com.ciecc.fire.ws.handler.MyStompSessionHandler;

public class WebSocketStompClient {

	public void a() {
		WebSocketClient webSocketClient = new StandardWebSocketClient();
		WebSocketStompClient stompClient = new WebSocketStompClient(webSocketClient);
		stompClient.setMessageConverter(new StringMessageConverter());
		stompClient.setTaskScheduler(taskScheduler); // for heartbeats

		String url = "ws://127.0.0.1:8080/endpoint";
		StompSessionHandler sessionHandler = new MyStompSessionHandler();
		stompClient.connect(url, sessionHandler);
	}
}
