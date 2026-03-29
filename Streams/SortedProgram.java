package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedProgram {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,5,3,4,6,7,2);

        List<Integer> newNums = nums.stream().sorted((a, b) -> (b - a)).collect(Collectors.toList());

        newNums.forEach(System.out::println);
    }
}
