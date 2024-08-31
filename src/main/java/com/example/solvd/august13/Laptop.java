package com.example.solvd.august13;

import java.util.Objects;

public class Laptop extends Computer implements Portable, Upgradeable, Configurable {
    public static final int MAX_BATTERY_LIFE = 10;
    public static final String DEVICE_TYPE = "Laptop";
    private static int deviceCount;

    private final Display display;
    private double weight;

    static {
        deviceCount = 0;
        System.out.println("Static block executed. Initial device count " + deviceCount);
    }

    public Laptop(String brand, String model, int ramSize, int storageSize, Display display,
                  double weight) {
        super(brand, model, ramSize, storageSize);
        this.display = display;
        this.weight = weight;
        deviceCount++;
    }

    public final void displayDeviceType() {
        System.out.println("Device type: " + DEVICE_TYPE);
    }

    public static void showDeviceCount() {
        System.out.println("Device count: " + deviceCount);
    }

    @Override
    public void boot() {
        System.out.println("Laptop is booting up");
    }

    @Override
    public void shutdown() {
        System.out.println("Laptop is shutting down");
    }

    @Override
    public void carryAround() {
        System.out.println("Carrying around the laptop");
    }

    @Override
    public void upgradeRAM(int size) {
        setRamSize(getRamSize() + size);
        System.out.println("RAM upgraded by " + size + "GB.");
    }

    @Override
    public void configureSettings() {
        System.out.println("Configuring laptop settings");
    }

    @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Screen height and width: " + display.getScreenHeight() + " "
                + display.getScreenWidth() + " inches, Weight: " + weight + " kg" +
                "Maximum battery life: " + MAX_BATTERY_LIFE + " hours.");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop laptop)) return false;
        return Double.compare(weight, laptop.weight) == 0 && Objects.equals(display, laptop.display);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "display=" + display +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(display, weight);
    }
}
