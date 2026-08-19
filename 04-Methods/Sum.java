import java.util.Scanner;
public class Sum{
    public static void  main(String[] args){
        // int ans = sum();  // calling function
        // System.out.println("Ans = " + ans);

        int ans = sum3(30,40);
        System.out.println("Ans = " + ans);
    }

    // pass the value of numbers when you are calling the method to main()
    static int sum3(int a , int b) {
        int sum = a + b ;
        return  sum;
    }
   // return the value 
    static int  sum(){
        Scanner input = new Scanner(System.in);
        //int num1 , num2, sum ;
        System.out.print("Enter number1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter number2 : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return  sum;
    }

}