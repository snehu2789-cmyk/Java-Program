public class FindMin{
    public static void main(String[] args) {
        int[] arr = { 5,7, 23, 14, 3, 8};
        int min = minValue(arr);
        System.out.println("Minimum value of array is : " + min);
    }
    static int minValue(int[] arr) {
        if (arr.length ==0 ){
            return  -1;
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
