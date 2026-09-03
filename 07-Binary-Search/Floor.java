public class Floor{
    public static void main(String[] args) {
        int[] arr = {2, 4 ,5,7 ,9 ,12, 14, 17,19,20};
        int target = 6;
        int ans = floorSearch(arr, target);
        System.out.println(ans);
    }

// return the index : greates number <= target
    static int floorSearch(int [] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target > arr[mid]){
                start =  mid + 1;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                // ans found
                return  mid;
            }
        }
        return end;
    }
}