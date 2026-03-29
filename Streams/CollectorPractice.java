package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tony", "Steve", "Bruce", "Stephen");

        List<String> newNames = names.stream()
                                    .map(name -> name.toUpperCase())
                                    .collect(Collectors.toList());

        newNames.forEach(System.out::println);
    }
}
