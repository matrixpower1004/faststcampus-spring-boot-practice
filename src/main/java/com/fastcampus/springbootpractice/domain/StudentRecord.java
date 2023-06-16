package com.fastcampus.springbootpractice.domain;

/**
 * author         : Jason Lee
 * date           : 2023-06-16
 * description    :
 */
public record StudentRecord(
        String name,
        Integer age,
        Grade grade

) {
    public static StudentRecord of(
            String name, Integer age, Grade grade) {
        return new StudentRecord(name, age, grade);
    }

    public enum Grade {
        A, B, C, D, F
    }
}
