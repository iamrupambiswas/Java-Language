package Day3;

public class MethodOverloading {

    static int add(int a, int b) {
        return a+b;
    }

    static float add(float a, float b) {
        return a+b;
    }

    static double add(double a, double b) {
        return a+b;
    }

    static long add(long a, long b) {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(add(10,10));
        System.out.println(add(15.5, 84.5));
        System.out.println(add(2.5f, 2.5f));
        System.out.println(add(100000L, 500000L));
    }
}
