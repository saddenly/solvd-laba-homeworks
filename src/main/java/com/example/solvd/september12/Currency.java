package com.example.solvd.september12;

public enum Currency {
    USD(1.0), EUR(0.85), GBP(0.75);

    private double rateToUsd;

    Currency(double rateToUsd) {
        this.rateToUsd = rateToUsd;
    }

    public double convertToUsd(double amount) {
        return amount * rateToUsd;
    }

    public double convertFromUsd(double amount) {
        return amount / rateToUsd;
    }
}
