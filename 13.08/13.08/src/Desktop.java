import java.util.Objects;

public class Desktop extends Computer {
    private String formFactor;

    public Desktop(String brand, String model, int ramSize, int storageSize, String formFactor) {
        super(brand, model, ramSize, storageSize);
        this.formFactor = formFactor;
    }

    @Override
    public void boot() {
        System.out.println("Desktop is booting up!");
    }

    @Override
    public void shutdown() {
        System.out.println("Desktop is shutting down!");
    }

    @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Form Factor: " + formFactor);
    }

    public void upgradeComponents() {
        System.out.println("Upgrading desktop components!");
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Desktop desktop)) return false;
        return Objects.equals(formFactor, desktop.formFactor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(formFactor);
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "formFactor='" + formFactor + '\'' +
                '}';
    }
}
