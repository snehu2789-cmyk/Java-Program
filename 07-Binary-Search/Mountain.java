public class Mountain{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 5, 6, 8, 5, 3, 2, 1};
        int ans = peakMountain(arr);
        System.out.println(ans);// peak value index
        System.out.println(arr[ans]);// peak index
    }
    static int peakMountain(int arr[]){ 
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in dec part of arr
                //this may be ans but look left
                //this is why end !=mid - 1
                end = mid;
            } else {
                //asc part of arr
                start = mid + 1;//bcz we know that mid + 1 > mid element
            }
        }
         // int the end start == end and pointing to the largest number bcz of 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element , that is max one bacasue that is what the checks say
        // more elaboration : at every point for start and end, they have the best possible ans till that time
        // and if we are saying that only item is remaining , hence cuz of above line that is bes possible ans  
         return start; // or returnend as botha are == pointing to same element
    }
}