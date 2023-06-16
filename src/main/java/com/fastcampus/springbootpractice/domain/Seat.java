package com.fastcampus.springbootpractice.domain;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * author         : Jason Lee
 * date           : 2023-06-16
 * description    :
 */
@AllArgsConstructor(staticName = "of")
@ToString
public class Seat {

    @ToString.Exclude private final Car car;
}
