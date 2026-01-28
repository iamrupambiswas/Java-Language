package Day15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Set.of(12,24,34,56,47));
        List<Integer> list = new ArrayList<>(List.of(12,34,25,21));

        set.retainAll(list);

        System.out.println(set);
    }
}
