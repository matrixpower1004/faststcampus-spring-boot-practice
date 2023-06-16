package com.fastcampus.springbootpractice.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * author         : Jason Lee
 * date           : 2023-06-16
 * description    :
 */
@ConstructorBinding
@ConfigurationProperties("my")
//@Configuration
public class MyProperties {

    private final Integer height;

    public MyProperties(Integer height) {
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

//    public void setHeight(Integer height) {
//        this.height = height;
//    }

}
