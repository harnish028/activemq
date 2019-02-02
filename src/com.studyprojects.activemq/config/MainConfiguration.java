package com.studyprojects.activemq.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({
        IpmJmsConfiguration.class,
        DefaultJmsConfiguration.class})
@Configuration
public class MainConfiguration {
}
