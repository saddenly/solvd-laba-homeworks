public class Laptop extends Computer {
    private double screenSize;
    private double weight;

    public Laptop(String brand, String model, int ramSize, int storageSize, double screenSize, double weight) {
        super(brand, model, ramSize, storageSize);
        this.screenSize = screenSize;
        this.weight = weight;
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
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Screen Size: " + screenSize + " inches, Weight: " + weight + " kg");
    }

    public void carry() {
        System.out.println("Carrying laptop around");
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}