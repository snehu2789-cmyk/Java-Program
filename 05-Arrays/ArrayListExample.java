import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        
        // list.add(89);
        // list.add(56);
        // list.add(34);
        // list.add(76);
        // list.add(99);
        // list.add(80);
        // list.add(75);
        // list.add(23);
        // list.add(2432);
        // list.add(21);
        // list.add(9);
        // list.add(6);

        // System.out.println(list.contains(21));
        // System.out.println(list);
        // list.set(2,78);
        // list.remove(3);
        // System.out.println(list);

        //input
        System.out.println("Enter an list array: ");
        for (int i = 0; i < 5; i++){
            list.add(input.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++){
            System.out.println(list.get(i));  // passs index here, list[index] syntax will not work here
        }
        System.out.println(list);
    }
}