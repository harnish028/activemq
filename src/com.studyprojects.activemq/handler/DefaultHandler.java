package com.studyprojects.activemq.handler;

import com.studyprojects.activemq.container.DocumentContainer;

public class DefaultHandler implements Handler {

    private final DocumentContainer documentContainer;

    public DefaultHandler(DocumentContainer documentContainer){
        this.documentContainer = documentContainer;
    }

    @Override
    public void doSomething() {
        System.out.println("container +" + documentContainer.getClass().getSimpleName());
    }
}
