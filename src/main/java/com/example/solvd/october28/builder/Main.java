package com.example.solvd.october28.builder;

public class Main {
    public static void main(String[] args) {
        Car bugatti = new CarBuilder()
                .id(1)
                .brand("Bugatti")
                .model("Chiron")
                .year(2022)
                .build();

        Director director = new Director();
        director.buildMercedes(new CarBuilder());
    }
}
