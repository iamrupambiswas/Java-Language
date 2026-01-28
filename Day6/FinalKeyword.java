package Day6;

public class FinalKeyword {
    public static void main(String[] args) {
        int age = 10;
        age++;
        System.out.println(age);

        final int age2 = 20;
        // age2++;
        System.out.println(age2);

        Ironman ironman = new Ironman();
        ironman.walk();
    }
}

class Human {
    final void speak() {
        System.out.println("Human speaking...");
    }

    void walk() {
        System.out.println("Human walking...");
    }
}

class Ironman extends Human {
    // void speak() {
    //     System.out.println("Ironman speaking...");
    // }

    void walk() {
        System.out.println("Ironman walking...");
    }
}

final class Car {
    void drive() {
        System.out.println("Car driving...");
    }
}

// class Toyota extends Car {
//     void drive() {
//         System.out.println("Toyota driving...");
//     }
// }