package Streams;

import java.util.Arrays;
import java.util.List;

public class ReducePractice {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(109, 23, 35, 48, 50);

        int max = nums.stream()
                        .reduce(0, (a, b) -> Math.max(a,b));

        System.out.println(max);
    }
}
