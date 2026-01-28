package Day16;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        System.out.println(map);

        int val = map.get("a");
        System.out.println(val);

        System.out.println(map.containsKey("c"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
