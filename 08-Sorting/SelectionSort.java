import java.util.Arrays;
public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            // Swap after finding maximum
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}