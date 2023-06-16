package com.fastcampus.springbootpractice;

import com.fastcampus.springbootpractice.properties.MyProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@ConfigurationPropertiesScan
@SpringBootApplication
public class FaststcampusSpringBootPracticeApplication {

    private final MyProperties myProperties;


    public static void main(String[] args) {
        SpringApplication.run(FaststcampusSpringBootPracticeApplication.class, args);
    } // end of main

    @PostConstruct
    public void init () {
        System.out.println("[ConfigurationProps] " + myProperties.getHeight());
    }
} // end of class
