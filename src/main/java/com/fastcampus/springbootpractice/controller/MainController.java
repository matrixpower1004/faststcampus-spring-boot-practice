package com.fastcampus.springbootpractice.controller;

import com.fastcampus.springbootpractice.service.SortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * author         : Jason Lee
 * date           : 2023-06-14
 * description    :
 */
@RestController
public class MainController {

    private final SortService sortService;

    public MainController(SortService sortService) {
        this.sortService = sortService;
    }

    @GetMapping("/")
    public String hello(@RequestParam List<String> list) {
        List<String> sortedList = sortService.doSort(list);
        System.out.println(sortedList);
        return sortedList.toString();
    }
}
