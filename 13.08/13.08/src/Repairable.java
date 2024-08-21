public interface Repairable {
    void diagnoseIssue();

    default void repair() {
        System.out.println("Repairing the device.");
    }
}
