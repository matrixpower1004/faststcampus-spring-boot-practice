package com.fastcampus.springbootpractice.logic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * author         : Jason Lee
 * date           : 2023-06-13
 * description    :
 */
@Component
public class JavaSort <T extends Comparable<T>> implements Sort<T> {

    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);
        Collections.sort(output);

        return output;
    }
}
