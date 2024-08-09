public class Computer {
    private String brand;
    private String model;
    private int ramSize;
    private int storageSize;

    public Computer(String brand, String model, int ramSize, int storageSize) {
        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    public void boot() {
        System.out.println("Computer is booting up");
    }

    public void shutdown() {
        System.out.println("Computer is shutting down");
    }

    public void displaySpecs() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", RAM Size: " + ramSize + ", Storage Size: " + storageSize);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }
}
