package LambaExpressions;

import java.util.function.Consumer;

public class ConsumerExpression {
    public static void main(String[] args) {
        Consumer<Integer> square = n -> System.out.println(n*n);

        square.accept(5);
    }
}
