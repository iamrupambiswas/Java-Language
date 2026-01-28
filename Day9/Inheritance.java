package Day9;

public class Inheritance {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();
    }
    
}

class Animal {
    Animal() {
        System.out.println("Animal constructor is called!");
    }

    void speak() {
        System.out.println("Animal make a sound!");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog constructor is called!");
    }

    @Override
    void speak() {
        System.out.println("Dog barks!");
    }
}
