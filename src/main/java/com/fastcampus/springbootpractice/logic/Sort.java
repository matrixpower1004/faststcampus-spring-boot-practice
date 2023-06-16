package com.fastcampus.springbootpractice.logic;

import java.util.List;

/**
 * author         : Jason Lee
 * date           : 2023-06-13
 * description    :
 */
public interface Sort <T extends Comparable<T>> {
    List<T> sort(List<T> list);
}
