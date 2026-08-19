import java.util.Arrays;

public class VarArgs{
    public static void main(String[] args) {
        fun(4,5,5,9,9);
        fun("Sneha");
        multiple(89, 34, "sneha","Suman", "Sumitra");
        multiple(89, 34, 90, 789, 78,34);

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    // overloading
    static void fun(String ...v) {
        System.out.println(Arrays.toString(v));
    }   
    
    static void multiple (int a , int b ,String ...v) {
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.println(Arrays.toString(v));
    }

    // overloading
    static void multiple(int a , int b , int ...v) {
        System.out.print(a + " ");
        System.out.print((b+ " "));
        System.out.println(Arrays.toString(v));
    } 
    // it's not valid 
    //     static void multiple (String ...v, int a) {}
    // valid rule
    //     static void multiple (nt a, String ...v, i) {}

}