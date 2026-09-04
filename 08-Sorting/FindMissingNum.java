import java.util.Arrays;
// it's number 0 to n
public class FindMissingNum{
    public static void main(String[] args) {
        int[] arr = {1,4 ,0, 3, 2};  
        cyclicSorting(arr);
        System.out.println(Arrays.toString(arr));
        int ans = searchMissing(arr);
        System.out.println(ans);

    }
    static void cyclicSorting(int[] arr){
        int start = 0;
        while (start < arr.length) { 
            int correct = arr[start];
            if (arr[start] != arr[correct] ){
                // swap
                int temp = arr[start];
                arr[start] = arr[correct];
                arr[correct] = temp;
            }else{
                start ++;
            }
        }
    }
    static int  searchMissing(int[]arr){
        // search for first missing number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }
}