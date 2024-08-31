package com.example.solvd.august13;

public interface Repairable {
    void diagnoseIssue();

    default void repair() {
        System.out.println("Repairing the device.");
    }
}
