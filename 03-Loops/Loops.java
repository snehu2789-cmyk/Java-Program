import java.util.Scanner;

public class Loops{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Syntax of for loops:
        for (initalization ; condition ; increment/decrement){
         body
        }
        */

      //  Q print numbers from 1 to 5
        for (int num = 1; num <= 5; num +=1){
            System.out.println(num);
        }

       // print numbers from 1 to n 
        System.out.print("Enter the value of n ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
          System.out.print(i + " ");
       System.out.println("Hello world!");
       }

        // while loops
        /*
             Syntax:
             while (condition){
             // body
             }
        */
        int num1 = 1;
        while (num1 <=5){
        System.out.println(num1);
        num1 +=1;
     }
        
        // do while loop
        /* Syntax:
        do {
            // body
        } while (condtion):
        */
 // It will execute atleast one time than check for condition
        int n1 = 1;
        do { 
            System.out.println("Hello world");
        } while (n1 != 1);
    }
}