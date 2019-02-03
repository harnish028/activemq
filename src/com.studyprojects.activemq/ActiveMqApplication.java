package com.studyprojects.activemq;

import com.studyprojects.activemq.handler.Handler;
import com.studyprojects.activemq.model.MessageProducer;
import com.studyprojects.activemq.model.ProviderServiceType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ActiveMqApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ActiveMqApplication.class);

        MessageProducer messageProducer = applicationContext.getBean(MessageProducer.class);
        messageProducer.getHandlers().forEach(Handler::doSomething);
        messageProducer.temp(ProviderServiceType.IPM);
    }
}
