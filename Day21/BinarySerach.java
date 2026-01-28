package Day21;

public class BinarySerach {
    public static void main(String[] args) {
        int[] arr = {2,6,3,5,8,1};

        System.out.println(BinarySearch(arr, 8));
    }

    public static int BinarySearch(int[] arr, int target) {
        int start=0;
        int end = arr.length-1;

        while(start<=end) {
            int mid = (start+end)/2;

            if(arr[mid] == (target)) {
                return mid;
            } else if(arr[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return -1;
    }
}
