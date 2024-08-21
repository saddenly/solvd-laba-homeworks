public interface Networkable {
    void connectToNetwork();

    default void disconnectFromNetwork() {
        System.out.println("Disconnected from network");
    }
}
