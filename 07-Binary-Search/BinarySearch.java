public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {-18, -12, -4, 0, 2, 4, 15, 16, 18, 22, 45, 89};
        int target = 18;
        int ans = binarySearch(arr, target);
         // Print the result
        if(ans != -1){
            System.out.println("Target found at index: " + ans);
        } else {
            System.out.println("Target not found");
        }
    }
    }
    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            // find the middle element
            int mid =  start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;

            }else{
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
