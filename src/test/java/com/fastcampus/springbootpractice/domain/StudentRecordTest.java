package com.fastcampus.springbootpractice.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * author         : Jason Lee
 * date           : 2023-06-16
 * description    :
 */
class StudentRecordTest {

    @Test
    void test() {
        // Given
        StudentRecord fred1 = StudentRecord.of("Fred", 21, StudentRecord.Grade.A);
        StudentRecord fred2 = StudentRecord.of("Fred", 21, StudentRecord.Grade.A);
        StudentRecord martie = StudentRecord.of("Martie", 30, null);

        // When & Then
        assertThat(fred1).isEqualTo(fred2);
        assertThat(fred1).isNotEqualTo(martie);

        System.out.println("I am a " + fred1);
        System.out.println("My name is " + fred1.name());
        System.out.println("I am " + fred1.age() + " years old");
        System.out.println("I got " + fred1.grade() + " yesterday");
    }

}
