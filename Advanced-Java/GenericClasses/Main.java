package GenericClasses;

public class Main {
    public static void main(String[] args) {
        Box<String> strBox = new Box<>();
        strBox.setValue("Hello");
        System.out.println("The value of string box is: " + strBox.getValue());

        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        System.out.println("The value of integer box is: " + intBox.getValue());

        Pair<Integer, String> number = new Pair<Integer,String>(1, "one");
        System.out.println("The value of key " + number.getKey() + " is " + number.getValue());
    }
}
