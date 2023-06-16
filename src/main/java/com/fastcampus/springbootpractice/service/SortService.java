package com.fastcampus.springbootpractice.service;


import com.fastcampus.springbootpractice.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author         : Jason Lee
 * date           : 2023-06-13
 * description    :
 */
@Service
public class SortService {

    private final Sort<String> sort;


    public SortService(@Qualifier("bubbleSort") Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }

}