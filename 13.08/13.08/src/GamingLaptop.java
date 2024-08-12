public class GamingLaptop extends Laptop {
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
}
