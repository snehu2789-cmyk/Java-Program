public class RS{
    public static void main(String[] args) {
        int arr[] = {3,4, 5, 6, 1, 2, 3};
        int target = 2;
        int pivot = findPivot(arr);
        if(pivot == -1){
          System.out.println(binarySearch(arr, target, 0, arr.length-1));
        } 
        if(target >= arr[0]){
            System.out.println(binarySearch(arr, target, 0, pivot));
        }else {
            System.out.println(binarySearch(arr, target, pivot + 1, arr.length-1));
        }
        System.out.println(findPivot(arr));
    }


    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid-1;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    
    static int findPivot(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            }else if(arr[mid] < arr[mid +1]){
                start = mid + 1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}