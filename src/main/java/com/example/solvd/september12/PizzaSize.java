package com.example.solvd.september12;

public enum PizzaSize {
    SMALL(8, "Small size"), MEDIUM(10, "Medium size"), LARGE(12, "Large size");

    private int price;
    private String description;

    PizzaSize(int price, String description) {
        this.price = price;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getSizeAndPrice() {
        return description + " costs $" + price;
    }

    static {
        System.out.println("Pizza sizes initialized");
    }
}
