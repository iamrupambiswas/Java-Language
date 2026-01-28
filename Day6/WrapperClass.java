package Day6;

public class WrapperClass {
    public static void main(String[] args) {
        
        int a = 10;
        System.out.println(a);

        Integer b = 20;
        System.out.println(b);

        Integer c = Integer.valueOf(b);
        System.out.println(c);

        a = b;
        c = a;

    }
}
