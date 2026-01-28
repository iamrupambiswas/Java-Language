package Day19;

import java.util.ArrayList;
import java.util.List;

public class ComparablePractice {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Zayn", 90));
        list.add(new Student("Alice", 75));

        System.out.println(list);
    }
}
