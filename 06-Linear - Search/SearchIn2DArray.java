import java.util.Arrays;



public class SearchIn2DArray{
    public static void main(String[] args) {
        int[][] arr={
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}};
       // System.out.println(Arrays.deepToString(arr));
       int target = 34;
       System.err.println(Arrays.toString(search(arr, target)));
       System.out.println(maxValue(arr));
    }

    static int[] search(int[][] arr , int target){
        if (arr.length == 0){
            return new int[]{-1 -1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(target == arr[row][col]){
                    return new int[] {row, col};
                }
            }
        }
        return  new  int[]{-1,-1};
    }

    static int maxValue(int[][] arr) {
        // minimun value in integer  given in java by .MIN_VALUE
        int max =Integer.MIN_VALUE;

        // enhanced for loop
        for (int[] arr1 : arr) {
            for (int elem: arr1) {
                if (max < elem) {
                    max = elem ;
                }     
            }
        }
        return max;
    }
}