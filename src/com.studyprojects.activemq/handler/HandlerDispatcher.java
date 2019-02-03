package com.studyprojects.activemq.handler;

import com.studyprojects.activemq.model.ProviderServiceType;

public interface HandlerDispatcher {

    Handler getHandler(ProviderServiceType providerService);

    ErrorHandler getErrorHandler(ProviderServiceType providerService);
}
