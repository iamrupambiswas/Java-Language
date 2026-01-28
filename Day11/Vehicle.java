package Day11;

public interface Vehicle {
    void start();
    void stop();

    default void horn() {
        System.out.println("Beep beep!");
    }

    static void service() {
        System.out.println("Servicing..");
    }
}
