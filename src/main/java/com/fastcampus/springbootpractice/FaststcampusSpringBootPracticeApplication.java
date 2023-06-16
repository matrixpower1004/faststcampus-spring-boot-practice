package com.fastcampus.springbootpractice;

import com.fastcampus.springbootpractice.properties.MyProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FaststcampusSpringBootPracticeApplication {

    private final Integer height;
    private final Environment environment;
    private final ApplicationContext applicationContext;
    private final MyProperties myProperties;

    public FaststcampusSpringBootPracticeApplication(
            @Value("${my.height}") Integer height,
            Environment environment,
            ApplicationContext applicationContext,
            MyProperties myProperties) {
        this.height = height;
        this.environment = environment;
        this.applicationContext = applicationContext;
        this.myProperties = myProperties;
    }

    public static void main(String[] args) {
        SpringApplication.run(FaststcampusSpringBootPracticeApplication.class, args);
//        SpringApplication application = new SpringApplication(FaststcampusSpringBootPracticeApplication.class);
//        application.setApplicationStartup(new FlightRecorderApplicationStartup());
//        application.setApplicationStartup(new BufferingApplicationStartup(1000));
//        application.run(args);
    } // end of main

    @PostConstruct
    public void init () {
        System.out.println("[@Value] " + height);
        System.out.println("[Environment] " + environment.getProperty(("my.height")));
        System.out.println("[ApplicationContext] " + applicationContext.getEnvironment().getProperty("my.height"));
        System.out.println("[ConfigurationProps] " + myProperties.getHeight());
    }
} // end of class
