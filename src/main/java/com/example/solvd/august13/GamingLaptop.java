package com.example.solvd.august13;

import java.util.Objects;

public final class GamingLaptop extends Laptop {
    private String gpuModel;

    public GamingLaptop(String brand, String model, int ramSize, int storageSize, Display display, double weight, String gpuModel) {
        super(brand, model, ramSize, storageSize, display, weight);
        this.gpuModel = gpuModel;
    }

    @Override
    public void boot() {
        System.out.println("Gaming laptop is booting up!");
    }

    @Override
    public void shutdown() {
        System.out.println("Gaming laptop is shutting down!");
    }

    @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Gaming laptop is displayed!");
    }

    public void playGame(String gameName) {
        System.out.println("Playing game " + gameName + " on high settings");
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GamingLaptop that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(gpuModel, that.gpuModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gpuModel);
    }

    @Override
    public String toString() {
        return "GamingLaptop{" +
                "gpuModel='" + gpuModel + '\'' +
                '}';
    }
}
