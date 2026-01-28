import java.util.*;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celcius: ");
        int celcius = sc.nextInt();
        float fahrenheit = (celcius * 9 / 5.0f) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        sc.close();
    }
}
