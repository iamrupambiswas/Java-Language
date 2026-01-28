package Day7;

import java.util.Scanner;

public class Calculator {

    static int add(int a, int b) {
        return a+b;
    }

    static int subtract(int a, int b) {
        return a-b;
    }

    static int multiply(int a, int b) {
        return a*b;
    }

    static int division(int a, int b) {
        if(b==0){
            System.out.println("Cannot divide by 0");
            return 0;
        }
        return a/b;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Choose operation: + - * /");
        int operation = sc.next().charAt(0);

        switch(operation) {
            case '+':
                System.out.println("Result: " + add(a, b));
                break;
            case '-':
                System.out.println("Result: " + subtract(a, b));
                break;
            case '*':
                System.out.println("Result: " + multiply(a, b));
                break;
            case '/':
                System.out.println("Result: " + division(a, b));
                break;
            default:
                System.out.println("Invalid operation!");
        }

    }
}
