public abstract class Computer {
    protected String brand;
    protected String model;
    protected int ramSize;
    protected int storageSize;

    protected Computer(String brand, String model, int ramSize, int storageSize) {
        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    public abstract void boot();

    public abstract void shutdown();

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
