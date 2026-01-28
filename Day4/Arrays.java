
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int arr2[] = new int[5];
        int[] arr3 = {1,2,3,4,5};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values for the array: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array1: ");
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

        System.out.println("Array2: ");
        for(int x: arr3){
            System.out.println(x);
        }
        
    }
}
