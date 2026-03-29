package Streams;

import java.util.Arrays;
import java.util.List;

public class SecondProgram {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tony", "Steve", "Bruce", "Stephen");

        names.stream()
            .map(name -> name.toUpperCase())
            .forEach(System.out::println);
    }
}
