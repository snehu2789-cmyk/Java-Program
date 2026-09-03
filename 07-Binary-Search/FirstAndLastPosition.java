import java.util.Arrays;
public  class FirstAndLastPosition {
    public static void main(String[] args) {

        int[] arr  ={ 5, 6, 7 ,7, 7, 7, 8 ,8, 10};
        int target = 6;
        int[] ans = {-1, -1};
        // check for first occurrence of target 
        ans[0] = firstLastPosition(arr, target, true);
        if (ans[0] !=1){
            ans[1] = firstLastPosition(arr, target, false);    
        }
        System.out.println(Arrays.toString(ans));
    }
    static int firstLastPosition(int[] arr , int target ,boolean isFirst) {
        int start = 0;
        int ans = -1;
        int end = arr.length-1;
        while (start <= end){
            // find the middle element
            // int mid = (start + end)/2; might be possible (start+ end)this calculation exceeds the range of integer  in java
            int mid = start + (end-start)/2;
            
            if(target > arr[mid]){
                start = mid + 1;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else {
                // potential ans found
                ans =  mid;
                if(isFirst){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}