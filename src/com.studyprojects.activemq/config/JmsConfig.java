package com.studyprojects.activemq.config;

import com.studyprojects.activemq.container.DocumentContainer;
import com.studyprojects.activemq.handler.Handler;
import org.springframework.jms.annotation.EnableJms;

public abstract class JmsConfig {

    abstract DocumentContainer getDocumentContainer();

    abstract Handler getHandler(DocumentContainer documentContainer);
}
