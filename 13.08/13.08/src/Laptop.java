public class Laptop extends Computer {
    private Display display;
    private double weight;

    public Laptop(String brand, String model, int ramSize, int storageSize, Display display, double weight) {
        super(brand, model, ramSize, storageSize);
        this.display = display;
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
        System.out.println("Screen height and width: " + display.getScreenHeight() + " "
                + display.getScreenWidth() + " inches, Weight: " + weight + " kg");
    }

    public void carry() {
        System.out.println("Carrying laptop around");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
