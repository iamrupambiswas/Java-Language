package Streams;

import java.util.*;

public class ThirdProgram {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,11,22);

        list.stream()
            .filter(n -> n%2 != 0)
            .map(n -> n*n)
            .forEach(System.out::println);
    }
}
