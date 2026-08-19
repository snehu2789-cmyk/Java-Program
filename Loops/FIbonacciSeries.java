import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number upto which fibonacci number generated: ");
        int num = input.nextInt();
        int f1 = 0;
        int f2 = 1 ;
        System.out.println(f1+" "+f2);
        for (int i = 2; i < num; i++) {
            int f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
    }
}