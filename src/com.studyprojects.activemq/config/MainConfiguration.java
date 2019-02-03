package com.studyprojects.activemq.config;

import com.studyprojects.activemq.handler.DefaultHandlerDispatcher;
import com.studyprojects.activemq.handler.HandlerDispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jms.annotation.EnableJms;

@Import({
        IpmJmsConfiguration.class,
        DefaultJmsConfiguration.class})
@EnableJms
@Configuration
public class MainConfiguration {

    @Autowired
    public ApplicationContext applicationContext;

    @Bean
    public HandlerDispatcher getHandlerDispatcher(){
        return new DefaultHandlerDispatcher(applicationContext);
    }
}
