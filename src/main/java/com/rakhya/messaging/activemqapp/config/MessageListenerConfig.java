/*package com.rakhya.messaging.activemqapp.config;

import javax.jms.ConnectionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

@Configuration
@EnableJms
public class MessageListenerConfig {

	@Autowired
    ConnectionFactory connectionFactory;
     
    @Bean
    public DefaultMessageListenerContainer jmMessageListenerContainer() {
    	DefaultMessageListenerContainer factory = new DefaultMessageListenerContainer();
        factory.setConnectionFactory(connectionFactory);
        factory.setDes
        //factory.setConcurrency("1-1");
        return factory;
    }
}
*/