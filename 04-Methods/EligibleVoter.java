import java.util.Scanner;
public class EligibleVoter{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter person Name: ");
        String name = input.nextLine();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        eligiblity(name,age);
    }

    static void eligiblity(String person, int b){
        if (b >= 18){
            System.out.println(person + " is eligible to vote");
        }else{
            System.out.println(person + " is not eligible to vote");
        }
    }
}