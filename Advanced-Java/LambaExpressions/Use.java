package LambaExpressions;

public class Use {

    public static void main(String[] args) {
        Add obj = (a, b) -> {
            int result = a+b;
            System.out.println("Sum: " + result);
            return result;
        };

        int total = obj.sum(5, 6);
        System.out.println("Returned value: " + total);
    }
}
