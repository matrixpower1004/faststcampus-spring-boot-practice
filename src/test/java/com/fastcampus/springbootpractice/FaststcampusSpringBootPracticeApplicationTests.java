package com.fastcampus.springbootpractice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class FaststcampusSpringBootPracticeApplicationTests {

    @Autowired
    private ObjectMapper mapper;

    @Test
    void contextLoads() throws JsonProcessingException {
        Date date = new Date();
        System.out.println(mapper.writeValueAsString(date));
    }

}
