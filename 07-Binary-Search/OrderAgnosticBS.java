public class OrderAgnosticBS{
    public static void main(String[] args) {
        int[] arr = {20, 18, 16, 15, 13, 11, 10 , 1, -7, -9};
        int target = -7;
        int ans = agnosticBs(arr, target);
        System.out.println(ans);
    }
    static int agnosticBs(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        // find whether the array is sorted in ascending or descending
        boolean isagbs = arr[start] < arr[end];
       
        while(start <= end){
            // find the element
            int mid = start + (end - start)/2;
            
            if (target == arr[mid]){
                return mid;
            }

            if (isagbs){
                // ascending array
                if (target > arr[mid]){
                    end  =  mid - 1;
                }else{
                    start = mid- 1;
                }
            } else{
                // descending array
                if (target > arr[mid]){
                    end  =  mid - 1;
                }else{
                     start = mid + 1;
                }               
            }
        }
        return -1;
    }
}