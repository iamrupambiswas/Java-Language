package Day10;

public class Polymorphism {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();

        p1.pay(100);
        p2.pay(100);
    }
}

class Payment {
    void pay(int amount) {
        System.out.println("Processing payment of " + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("Processing payment of " + amount + " using credit card!");
    }
}

class UPIPayment extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("Processing payment of " + amount + " using UPI!");
    }
}