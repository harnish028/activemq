package com.studyprojects.activemq.config;

import com.studyprojects.activemq.container.DocumentContainer;
import com.studyprojects.activemq.container.IpmContainer;
import com.studyprojects.activemq.handler.DefaultHandler;
import com.studyprojects.activemq.handler.Handler;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IpmJmsConfiguration extends JmsConfig {

    @Bean("ipmContainer")
    @Override
    DocumentContainer getDocumentContainer() {
        return new IpmContainer();
    }

    @Bean("ipmHandler")
    @Override
    Handler getHandler(@Qualifier(value = "ipmContainer") DocumentContainer documentContainer) {
        return new DefaultHandler(documentContainer);
    }
}
