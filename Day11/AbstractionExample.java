package Day11;

public class AbstractionExample {

    public static void main(String[] args) {
        Vehicle car = new Car();

        car.start();
        car.horn();
        Vehicle.service();
    }
    
}

interface Vehicle {
    void start();
    void stop();

    default void horn() {
        System.out.println("Beep beep!");
    }

    static void service() {
        System.out.println("Servicing..");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Starting...");
    }

    public void stop() {
        System.out.println("Stopping...");
    }
}