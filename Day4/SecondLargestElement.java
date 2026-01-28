public class SecondLargestElement {
    public static void main(String[] args) {
        int[] num = {5,3,7,4,1,7};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++) {
            if(num[i] > first) {
                second = first;
                first = num[i];
            } else if(num[i] > second && num[i] != first) {
                second = num[i];
            }
        }

        System.out.println("Second highest: " + second);
    }
}
