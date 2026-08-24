import java.util.Arrays;
import java.util.Scanner ;

public class Input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    //  Arrays of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 76;
        arr[3] =65;
        arr[4] = 544;
        // [23,45,76,65,544]  stores like this
        System.out.println(arr[0]);

        // input using for loops
        // i < arr.legth it can like this also if you don't the length of the array
        System.out.println("Enter the values of array");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Array contains : ");
        // best way to print arrays 
        System.out.println(Arrays.toString(arr));
        
        // for (int i = 0; i < 5; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // shortcut for loop of above display loop
        
        for (int num : arr) {  // for every elemnt in array , print the element
            System.out.print(num + " "); // here num represents element of the array
        }

        // System.out.println(arr[5]); // index out of bound error
       
       // arrays of objects
       System.out.println("Enter the array for strings object");
       String[] str = new String[4];
       for (int i = 0; i < str.length; i++) {
           str[i] = input.next();
       }
       // displaying the str aaray containing object of string
        System.out.println(Arrays.toString(str));

        // modify 
        str[2] = "Jitesh";
        System.out.println(Arrays.toString(str));
    }
}