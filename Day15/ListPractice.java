package Day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(20);
        list.add(1, 50);            // to add element in a specific index

        System.out.println(list);

        int val = list.get(1);          // to get element from a specific index
        System.out.println(val);

        list.set(1, 55);            // to update an element in a specific index
        System.out.println(list.get(1));

        list.remove(1);         // to remove by index
        System.out.println(list);

        list.remove(Integer.valueOf(20));           // to remove by element
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        for(int num: list) {
            newList.add(num*2);
        }
        System.out.println(newList);

        Iterator<Integer> it = newList.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
