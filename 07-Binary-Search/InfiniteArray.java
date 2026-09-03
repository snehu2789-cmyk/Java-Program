public class InfiniteArray{
    public static void main(String[] args) {
        int arr[] = {1, 2,4, 5 ,6, 8, 9, 12, 14, 15, 17, 18,21,23,26,29, 30};
        int target = 8;
        int ans = ans(arr, target);
        System.out.println(ans); 
        
    }

    static int ans(int arr[], int target) {
        // first find the range
        // first start with a box size of 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]){
            int newStart = end + 1 ;
            // double box size 
            // end = previous box + size of box * 2
            end = end + ((end - start) + 1)* 2;
            start = newStart;
        }
        return binarySearch(arr, start, end, target);
    }
    static int binarySearch(int[] arr, int start , int  end, int target){
        while (start <= end){
        
            int mid = start + (end - start)/2;
            
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}