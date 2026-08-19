import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check odd or even: ");
        int num = input.nextInt();
        if (num % 2 ==0){
            System.out.println(num + " is the even number");
        }
        else{
            System.out.println(num + " is the odd number");
        }
    }
}