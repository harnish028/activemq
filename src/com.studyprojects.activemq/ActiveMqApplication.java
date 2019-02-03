package com.studyprojects.activemq;

import com.studyprojects.activemq.model.MessageProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ActiveMqApplication {

    public static void main(String[] args) {

        SpringApplication.run(ActiveMqApplication.class);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        MessageProducer messageProducer = applicationContext.getBean(MessageProducer.class);
        messageProducer.toString();
        messageProducer.temp();
    }
}
