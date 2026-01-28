package Day20;

import java.util.*;

public class KLargestElement {
    public static void main(String[] args) {
        
        int[] nums = {3, 2, 1, 5, 4};
        int k = 2;

        System.out.println(kLargest(nums, k));
    }

    public static List<Integer> kLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num: nums) {
            minHeap.add(num);

            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return new ArrayList<>(minHeap);
    }
}
