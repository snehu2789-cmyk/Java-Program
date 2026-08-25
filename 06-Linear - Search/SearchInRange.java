public class SearchInRange{
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 76, 23, 14};
        int start = 2;
        int end = 5;
        int target =76;
        int ans = searchrange(arr, start,end, target);
        System.out.println(ans);
    }
    static int searchrange(int[] arr, int start, int end, int target) {
        if (arr.length == 0){
            return -1;
        }

        // run a loop
        for (int i = start; i <= end; i++) {
            if(target == arr[i])
            return i;
        }

        // this line will execute when none of the above execute
        // this will return target not found
        return -1;
    }
}