import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Computer laptop = new Laptop("Dell", "XPS 13", 16, 512, new Display(13.3, 12.2), 1.2);
        laptop.displaySpecs();
        laptop.boot();
        laptop.shutdown();

        System.out.println();

        Computer desktop = new Desktop("HP", "Omen", 32, 1024, "Tower");
        desktop.displaySpecs();
        desktop.boot();
        desktop.shutdown();

        System.out.println();

        Server server = new Server("IBM", "Power9", 128, 2048, 32);
        server.displaySpecs();
        server.boot();
        server.handleRequest();
        server.shutdown();

        System.out.println();

        GamingLaptop gamingLaptop = new GamingLaptop("Asus", "Rog Zephyrus", 32, 1024, new Display(15.6, 14.4), 2.5, "NVIDIA RTX 3060 TI");
        gamingLaptop.displaySpecs();
        gamingLaptop.boot();
        gamingLaptop.playGame("Wither 3");
        gamingLaptop.shutdown();
    }
}