public class Server extends Computer {
    private int coresNumber;

    public Server(String brand, String model, int ramSize, int storageSize, int coresNumber) {
        super(brand, model, ramSize, storageSize);
        this.coresNumber = coresNumber;
    }

    @Override
    public void boot() {
        System.out.println("Server is booting up!");
    }

    @Override
    public void shutdown() {
        System.out.println("Server is shutting down!");
    }

    @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Cores: " + coresNumber);
    }

    public void handleRequest() {
        System.out.println("Server is handling a request!");
    }

    public int getCoresNumber() {
        return coresNumber;
    }

    public void setCoresNumber(int coresNumber) {
        this.coresNumber = coresNumber;
    }
}
