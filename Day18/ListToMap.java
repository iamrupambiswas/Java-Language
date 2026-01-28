package Day18;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Employee> empList = List.of(
            new Employee(1, "Tony", 100000),
            new Employee(2, "Steve", 50000),
            new Employee(3, "Bruce", 100000)
        );

        System.out.println(empList);

        Map<Integer, String> empMap = empList.stream()
        .collect(Collectors.toMap(
            e -> e.id, 
            e -> e.name
        ));

        System.out.println(empMap);
    }
}
