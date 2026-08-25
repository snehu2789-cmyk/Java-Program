public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {2,4,68,14,25};
        int target = 14;
       int ans =targetSearch(arr, target);
       System.err.println(target + " found at index " + ans);
       System.err.println(targetSearch2(arr, target));
       System.err.println(targetSearch3(arr, target));
    }
    
    // search the elemtn and return the index
    static int targetSearch(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    // to check whether the target value present or not
    static boolean targetSearch2(int[] arr , int search) {
        if(arr.length == 0){
            return false;
        }

        // run a for loop
        for (int element : arr) {
            if (element == search){
                return true;
               }
            }
            // this line will execute if none of return statements above have executed
            // hence the target found
        return false;
    }

    static int targetSearch3(int[] arr , int search) {
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for (int element : arr) {
            if (element == search){
                return element;
               }
            }
            // this line will execute if none of return statements above have executed
            // hence the target found
        return  Integer.MAX_VALUE;
    }
}