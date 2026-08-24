import java.util.Arrays;
import java.util.Scanner;
public class MultiDimensionArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
             1 2 3
             4 5 6
             7 8 9
        */
       // int[][] arr  = new [3][];

        // int[][] arr = {
        //     {1, 2, 3},  // 0th index
        //     {4, 5},   // 1st index
        //     {6, 7, 8, 9}   // 2nd index -> arr[2] = {6,,7,8,9}
        // };

        int[][] arr = new int[3][3];
        System.out.println(arr.length);  // give no of rows
        
        // input in 2d array
        for (int row = 0; row < arr.length; row++){
            // for each col in every row
            for (int col =0; col < arr[row].length; col++){
                arr[row][col] = input.nextInt();
            }
        }
        // for (int row = 0; row < arr.length; row++){
        //     // for each col in every row
        //     for (int col =0; col < arr[row].length; col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

// enhanced for loop to print 2D array
        // for (int row = 0; row < 10; row++) {
        //     System.out.println(Arrays.toString(arr[row]));
        // }
        
        // more enhace for loop thab above
        for(int[] a : arr){
            System.out.print(Arrays.toString(a));
        }
// for the string array
        // for(String[] element: arr){
        //     System.out.print(element);
        // }
    }
}