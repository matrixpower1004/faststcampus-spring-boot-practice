package com.fastcampus.springbootpractice.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author         : Jason Lee
 * date           : 2023-06-16
 * description    :
 */
class CarTest {

    @Test
    void test() {
        Car car = Car.of("My Car");
        Seat seat = Seat.of(car);
        car.setSeats(List.of(seat));

        System.out.println(car);
    }

}