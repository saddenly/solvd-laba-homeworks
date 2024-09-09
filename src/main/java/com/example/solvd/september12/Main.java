package com.example.solvd.september12;

public class Main {
    public static void main(String[] args) {
        Calculation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.operate(5, 10));

        StringModifier toUpperCase = (str) -> str.toUpperCase();
        System.out.println("Uppercase: " + toUpperCase.modify("java"));

        TriFunction<Double, Double, Double, Double> volumeOfCuboid = (length, width, height) -> length * width * height;
        System.out.println("Cuboid Volume: " + volumeOfCuboid.apply(2.5, 3.0, 4.0));

    }
}
