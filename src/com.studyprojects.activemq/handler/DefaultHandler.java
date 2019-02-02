package com.studyprojects.activemq.handler;


import com.studyprojects.activemq.container.DocumentContainer;

public class DefaultHandler implements Handler {

    private DocumentContainer documentContainer;

    public DefaultHandler(DocumentContainer documentContainer){
        this.documentContainer = documentContainer;
    }

    @Override
    public void doSomething() {
        System.out.println("container +" + documentContainer.getClass().getName());
    }
}
