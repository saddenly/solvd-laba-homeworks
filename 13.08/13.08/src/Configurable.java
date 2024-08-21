public interface Configurable {
    void configureSettings();

    default void resetSettings() {
        System.out.println("Settings reset to default.");
    }
}
