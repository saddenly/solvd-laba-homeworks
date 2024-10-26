package com.example.solvd.october28.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class Car {
    private final int id;
    private final String brand;
    private final String model;
    private final int year;
}
