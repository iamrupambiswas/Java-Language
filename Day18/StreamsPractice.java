package Day18;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractice {
    public static void main(String[] args) {
        List<Employee> empList = List.of(
            new Employee(1, "Tony", 100000),
            new Employee(2, "Steve", 50000),
            new Employee(3, "Bruce", 100000)
        );

        double threshold = 75000;

        List<Employee> resuList = empList.stream()
        .filter(e -> e.salary > threshold)
        .collect(Collectors.toList());

        System.out.println(resuList);
    }
}
