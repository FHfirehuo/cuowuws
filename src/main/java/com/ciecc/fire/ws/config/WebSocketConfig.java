//package com.ciecc.fire.ws.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.messaging.simp.config.MessageBrokerRegistry;
//import org.springframework.web.socket.WebSocketHandler;
//import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
//import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
//import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
//import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
//import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurationSupport;
//
//import com.ciecc.fire.ws.websocket.MyHandler;
//
//@Configuration
//@EnableWebSocketMessageBroker
//public class WebSocketConfig extends WebSocketMessageBrokerConfigurationSupport implements WebSocketConfigurer{ // implements
//																					// WebSocketMessageBrokerConfigurer
//
//	@Override
//	public void registerStompEndpoints(StompEndpointRegistry registry) {
//		registry.addEndpoint("/portfolio").withSockJS();
//	}
//
//	@Override
//	public void configureMessageBroker(MessageBrokerRegistry config) {
//		config.setApplicationDestinationPrefixes("/app");
//		config.enableSimpleBroker("/topic", "/queue");
//	}
//
//	@Bean
//	public WebSocketHandler myHandler() {
//		return new MyHandler();
//	}
//
//	@Override
//	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//		registry.addHandler(myHandler(), "/myHandler");
//		
//	}
//
//}
