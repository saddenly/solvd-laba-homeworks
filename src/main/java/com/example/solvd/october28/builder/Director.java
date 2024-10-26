package com.example.solvd.october28.builder;

public class Director {
    public void buildBugatti(Builder builder) {
        builder.brand("Bugatti")
                .model("Chiron")
                .year(2022)
                .build();
    }

    public void buildMercedes(Builder builder) {
        builder.brand("Mercedes")
                .model("Banana")
                .year(2022)
                .build();
    }
}
