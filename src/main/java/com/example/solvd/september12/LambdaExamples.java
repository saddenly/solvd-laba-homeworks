package com.example.solvd.september12;

import java.util.function.*;

public class LambdaExamples {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println("Is 4 even: " + isEven.test(4));

        Function<String, Integer> stringLength = (str) -> str.length();
        System.out.println("Length of string: " + stringLength.apply("abc"));

        Consumer<String> printer = (message) -> System.out.println("Message: " + message);
        printer.accept("Hello World");

        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number: " + randomSupplier.get());

        BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;
        System.out.println("Max of 4 and 8: " + max.apply(4, 8));

    }
}
