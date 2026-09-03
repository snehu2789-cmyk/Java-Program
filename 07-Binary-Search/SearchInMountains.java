public class SearchInMountains{
    public static void main (String[] args){
        int[] arr = {1, 2, 3 , 5, 7, 4, 3, 2};
        int target = 4;
        int peak = peakMountain(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        int ans =0;
        if(firstTry != -1){
            ans = firstTry;
        } else {
            ans = orderAgnosticBS(arr,target, peak + 1, arr.length-1);
        }
        // try to search in other part i.e second half
        System.out.println(ans);
    }
    static int peakMountain(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start + (end-start)/2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int arr[] , int target , int start, int end){
        boolean isAsc = arr[start] <= arr[end];
        while (start <= end){
            int mid = start + (end-start)/2;
            if (target == arr[mid]){
                return mid;
            }
            if (isAsc){
                if (target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if (target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid +1;
                }
            }
        }
        return  -1;
    }
}