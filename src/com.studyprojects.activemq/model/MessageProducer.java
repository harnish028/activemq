package com.studyprojects.activemq.model;

import com.studyprojects.activemq.handler.Handler;
import com.studyprojects.activemq.handler.HandlerDispatcher;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class MessageProducer {

    private final List<Handler> handlers;
    private final HandlerDispatcher handlerDispatcher;

    @Autowired
    public MessageProducer(HandlerDispatcher handlerDispatcher, List<Handler> handlers) {
        this.handlerDispatcher = handlerDispatcher;
        this.handlers = handlers;
    }

    public void temp(ProviderServiceType providerServiceType) {
        Handler handler = handlerDispatcher.getHandler(providerServiceType);
        handler.doSomething();
    }
}
