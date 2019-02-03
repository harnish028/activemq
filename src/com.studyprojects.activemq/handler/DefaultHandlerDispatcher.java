package com.studyprojects.activemq.handler;

import com.studyprojects.activemq.model.ProviderServiceType;
import org.springframework.context.ApplicationContext;

import java.util.EnumMap;
import java.util.Map;

public class DefaultHandlerDispatcher implements HandlerDispatcher{

    //todo: должно быть в каждом сервисе
    private static final Map<ProviderServiceType, String> handlers = new EnumMap<>(ProviderServiceType.class);
    static {
        handlers.put(ProviderServiceType.DEFAULT, "defaultHandler");
        handlers.put(ProviderServiceType.IPM, "ipmHandler");
    }

    private ApplicationContext applicationContext;

    public DefaultHandlerDispatcher(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Handler getHandler(ProviderServiceType providerService) {
        if(handlers.containsKey(providerService)) {
            return (Handler) applicationContext.getBean(handlers.get(providerService));
        }

        throw new IllegalArgumentException("Not found bean for: " + providerService);
    }

    @Override
    public ErrorHandler getErrorHandler(ProviderServiceType providerService) {
        return null;
    }
}
