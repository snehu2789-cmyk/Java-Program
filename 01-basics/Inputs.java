import  java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking string input
        System.out.print("Enter your Name: ");
        String name = input.nextLine();
        System.out.println("Name: " + name);

        //taking int input
        System.out.print("please enter rollno: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is "+ rollno); 

        // taking string input
        System.out.print("please enter Marks: ");
        float marks = input.nextFloat();
        System.out.println("Your Marks is "+ marks); 
    }
}
