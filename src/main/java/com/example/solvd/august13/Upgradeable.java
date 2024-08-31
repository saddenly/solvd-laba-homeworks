package com.example.solvd.august13;

public interface Upgradeable {
    void upgradeRAM(int size);

    default void upgradeStorage(int size) {
        System.out.println("Upgraded storage by " + size + " GB.");
    }
}
