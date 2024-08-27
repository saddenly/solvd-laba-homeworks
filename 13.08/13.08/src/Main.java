import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(new Laptop("Dell", "XPS 13", 16, 512, new Display(15,16), 3));
        laptopList.add(new Laptop("HP", "Spectre", 16, 512, new Display(15, 16), 2));

        System.out.println("List of Laptops:");
        for (Laptop laptop : laptopList) {
            laptop.displaySpecs();
        }

        Set<String> computerModelSet = new HashSet<>();
        computerModelSet.add("XPS 13");
        computerModelSet.add("Spectre");
        computerModelSet.add("ROG Zephyrus");
        computerModelSet.add("Spectre");

        System.out.println("\nSet of unique Computer models:");
        for (String model : computerModelSet) {
            System.out.println("Model: " + model);
        }

        Map<String, Computer> computerMap = new HashMap<>();
        Computer gamingLaptop = new GamingLaptop("Asus", "ROG Zephyrus", 32, 1024, new Display(15, 16), 3, "NVIDIA RTX 3080");
        Computer macbook = new Laptop("Apple", "MacBook Pro", 16, 512, new Display(15, 16), 3);

        computerMap.put("Asus", gamingLaptop);
        computerMap.put("Apple", macbook);

        System.out.println("\nMap of Computer brand to Computer object:");
        for (Map.Entry<String, Computer> entry : computerMap.entrySet()) {
            System.out.println("Brand: " + entry.getKey() + ", Model: " + entry.getValue().getModel());
        }

        Queue<Computer> computerQueue = new LinkedList<>();
        computerQueue.add(gamingLaptop);
        computerQueue.add(macbook);

        System.out.println("\nQueue of Computers for processing:");
        while (!computerQueue.isEmpty()) {
            Computer computer = computerQueue.poll();
            System.out.println("Processing: " + computer.getBrand() + " " + computer.getModel());
        }

        Stack<Computer> shutdownStack = new Stack<>();
        shutdownStack.push(gamingLaptop);
        shutdownStack.push(macbook);

        System.out.println("\nStack of Computer shutdown history:");
        while (!shutdownStack.isEmpty()) {
            Computer computer = shutdownStack.pop();
            computer.shutdown();
        }

        Portable portableDevice = new Laptop("HP", "Spectre", 16, 512, new Display(15, 16), 2);
        portableDevice.carryAround();

        Upgradeable upgradeableDevice = new Laptop("Apple", "MacBook Pro", 16, 512, new Display(15, 16), 3);
        upgradeableDevice.upgradeRAM(16);

        Configurable configurableDevice = new GamingLaptop("MSI", "Raider GE76", 32, 1024, new Display(15, 16), 2, "NVIDIA RTX 3070");
        configurableDevice.configureSettings();
    }
}