import java.util.Scanner;

public class MinMaxChecker{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        max(num1, num2, num3);
        min(num1, num2, num3);

    }

    static void max(int a, int b, int c) {
        int max = a;

        if (max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        System.out.println("Maximun: " + max);
        
    }

    static void min(int a, int b, int c) {
        int min = a;
        if (min > b){
            min = b;
        }
        if(min > c){
            min = c;
        }
        System.out.println("Minimum: " + min);
    }
}