package Day2;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int n = number;

        int sum = 0;

        while(number>0){
            int rem = number%10;
            sum += rem*rem*rem;
            number = number/10;
        }

        if(sum==n)
            System.out.println(n+" is ArmStrong!");
        else
            System.out.println(n+" is not ArmStrong!");
    }
}
