public class DuplicateRBS {
    public static void main (String[] args){
        int[] arr = {4 ,5, 5 ,2 ,2, 2, 3};
        int target = 3;
        System.out.println(mainSearch(arr,target));
    }
    static int mainSearch(int[] arr,int target){
        int pivot = findPivot(arr);
        if (pivot ==-1){
            return binarySearch(arr, target, 0 , arr.length-1);
        }
        if (arr[pivot] == target){
            return pivot;
        }
        if (arr[0] <= target){
            return binarySearch(arr, target, 0, pivot);
        }else{
            return binarySearch(arr, target, pivot + 1, arr.length-1);
            }
        }

    // binary search
    static int binarySearch(int[] arr, int target , int start, int end){
        while (start <= end){
            int mid = start + (end-start)/2;
            if (arr[mid] > target){
                end = mid-1;
            }else if (arr[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }


    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while ( start <= end){
            int mid = start + (end - start)/2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            // skip duplicates if start == mid == end elements
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                // check if start is the pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start ++;
                // check if end is the pivot
                if (start < end && arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;

            }else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start  = mid  + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;

    }
}