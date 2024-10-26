package com.example.solvd.october28.builder;

public interface Builder {
    Builder id(int id);
    Builder brand(String brand);
    Builder model(String model);
    Builder year(int year);
    Car build();
}
