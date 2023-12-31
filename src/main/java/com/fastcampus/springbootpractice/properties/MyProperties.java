package com.fastcampus.springbootpractice.properties;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * author         : Jason Lee
 * date           : 2023-06-16
 * description    :
 */
@Getter
@ConstructorBinding
@ConfigurationProperties("my")
public class MyProperties {

    /** 제 키에요 */
    private final Integer height;

    public MyProperties(Integer height) {
        this.height = height;
    }

}
