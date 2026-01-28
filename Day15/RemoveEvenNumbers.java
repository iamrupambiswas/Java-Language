package Day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(23, 12, 40, 19, 33, 2, 80));

        Iterator<Integer> it = nums.iterator();

        while(it.hasNext()) {
            int num = it.next();
            if(num % 2 == 0) {
                it.remove();
            }
        }

        System.out.println(nums);

    }
}
