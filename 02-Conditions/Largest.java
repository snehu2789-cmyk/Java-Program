import java.util.Scanner;
public class Largest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd   number: ");
        int b = input.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = input.nextInt();

        // Q; Find the largest of 3 number
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.print("Largest number: " + max);

        // built in 
        // int maxm = Math.max(c,Math.max(a, b));
        // System.out.println(Math.max(maxm));
        // System.out.println(Math.max(10,40));

        // one more method

        // if (a > b & a > c){
        //     System.out.println("Largest Number: " + a);
        // } else if (b > c){
        //     System.out.println("Largest Number: " + b);
        // } else{
        //     System.out.println("Largest Number: " + c);
        // }

    }
}