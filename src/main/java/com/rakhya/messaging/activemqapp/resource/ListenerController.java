package com.rakhya.messaging.activemqapp.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.config.JmsListenerEndpointRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/listener")
public class ListenerController {
	
	@Autowired
	ConfigurableApplicationContext context;
	

	@GetMapping(value = "/stop")
	public String haltJmsListener() {
		JmsListenerEndpointRegistry registry = context.getBean(JmsListenerEndpointRegistry.class);
		registry.stop();
		return "Jms Listener Stopped";
	}

	@GetMapping(value = "/start")
	public String reStartJmsListener() {
		JmsListenerEndpointRegistry registry = context.getBean(JmsListenerEndpointRegistry.class);
		registry.start();
		return "Jms Listener restarted";
	}

}
