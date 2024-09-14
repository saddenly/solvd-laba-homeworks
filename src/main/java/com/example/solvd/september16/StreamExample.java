package com.example.solvd.september16;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class StreamExample {
    private final static Logger LOGGER = Logger.getLogger(StreamExample.class.getName());

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0);

        Stream<Integer> squaredNumbers = evenNumbers.map(n -> n * n);

        List<Integer> squaredList = squaredNumbers.toList();

        squaredList.forEach(n -> LOGGER.info("Squared number: " + n));

        int sumOfSquares = squaredList.stream().reduce(0, Integer::sum);
        LOGGER.info("Sum of Squared numbers: " + sumOfSquares);

        long countGreaterThan10 = squaredList.stream().filter(n -> n > 10).count();
        LOGGER.info("Count greater than 10: " + countGreaterThan10);

        List<Integer> sortedList = squaredList.stream().sorted().toList();
        sortedList.forEach(n -> LOGGER.info("Sorted squared number: " + n));
    }
}
