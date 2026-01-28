
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<matrix.length;i++){
            System.out.println("Enter the values for "+(i+1)+" row: ");
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.err.println("The matrix: ");
        for(int[] row: matrix){
            for(int val: row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
