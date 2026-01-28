package Day20;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // min hip
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(5);
        minHeap.add(1);
        minHeap.add(10);

        System.out.println(minHeap.peek());

        // max hip
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);

        maxHeap.add(5);
        maxHeap.add(1);
        maxHeap.add(10);

        System.out.println(maxHeap.peek());
    }
}
