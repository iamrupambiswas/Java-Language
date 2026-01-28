package Day21;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        System.out.println(maxSum(nums, 3));
    }

    public static int maxSum(int[] arr, int k) {
        int maxSum = 0;
        int windowSum = 0;

        for(int i=0;i<arr.length;i++) {
            windowSum += arr[i];

            if(i >= k-1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[i-(k-1)];
            }
        }
        return maxSum;
    }
}
