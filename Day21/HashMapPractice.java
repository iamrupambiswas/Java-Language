package Day21;

import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] res = twoSum(nums, 9);
        System.out.println(res[0] + ", " + res[1]);
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length;i++) {
            int complement = target - nums[i];

            if(hm.containsKey(complement)) {
                return new int[]{hm.get(complement), i};
            }

            hm.put(nums[i], i);
        }

        return new int[]{-1,-1};
    }
}
