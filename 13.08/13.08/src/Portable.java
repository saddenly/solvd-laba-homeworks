public interface Portable {
    void carryAround();

    default void putDown() {
        System.out.println("Put down the device.");
    }
}
