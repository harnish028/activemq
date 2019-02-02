package com.studyprojects.activemq.config;

import com.studyprojects.activemq.container.DefaultContainer;
import com.studyprojects.activemq.container.DocumentContainer;
import com.studyprojects.activemq.handler.DefaultHandler;
import com.studyprojects.activemq.handler.Handler;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultJmsConfiguration extends JmsConfig{

    @Bean("defaultContainer")
    @Override
    DocumentContainer getDocumentContainer() {
        return new DefaultContainer();
    }

    @Bean("defaultHandler")
    @Override
    Handler getHandler(@Qualifier(value = "defaultContainer") DocumentContainer documentContainer) {
        return new DefaultHandler(documentContainer);
    }
}
