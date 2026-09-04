import java.util.Arrays;
public class CyclicSort{
    public static void main(String[] args){
        int[] arr = {3, 4, 5, 2, 1,};
        cyclic(arr);    
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        int start =0;
        while (start < arr.length) {
            int correct = arr[start] - 1;
            if (arr[start] !=  arr[correct]){
                // swap      
                int temp = arr[start];
                arr[start] = arr[correct];
                arr[correct] = temp;
            }else{
                start ++;
            }
        }
    }
}