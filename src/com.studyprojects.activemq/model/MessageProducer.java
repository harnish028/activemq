package com.studyprojects.activemq.model;

import com.studyprojects.activemq.handler.HandlerDispatcher;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ToString
@Component
public class MessageProducer {

    private HandlerDispatcher handlerDispatcher;

    @Autowired
    public MessageProducer(HandlerDispatcher handlerDispatcher) {
        this.handlerDispatcher = handlerDispatcher;
    }

    public void temp(){
        handlerDispatcher.getHandler(ProviderServiceType.IPM);
    }
}
