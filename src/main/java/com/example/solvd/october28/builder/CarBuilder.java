package com.example.solvd.october28.builder;

public class CarBuilder implements Builder{
    private int id;
    private String brand;
    private String model;
    private int year;

    public CarBuilder id (int id) {
        this.id = id;
        return this;
    }

    public CarBuilder brand (String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder model (String model) {
        this.model = model;
        return this;
    }

    public CarBuilder year (int year) {
        this.year = year;
        return this;
    }

    public Car build() {
        return new Car(id, brand, model, year);
    }
}
