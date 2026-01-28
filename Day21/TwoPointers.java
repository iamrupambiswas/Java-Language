package Day21;

public class TwoPointers {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 7, 11};
        int[] res = twoSum2(nums, 9);

        System.out.println(res[0] + ", " + res[1]);
    }

    public static int[] twoSum2(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int sum = arr[start] + arr[end];

            if(sum == target) {
                return new int[]{start, end};
            }
            else if(sum < target) {
                start++;
            } else {
                end--;
            }
        }

        return new int[]{-1, -1};
    }
}
