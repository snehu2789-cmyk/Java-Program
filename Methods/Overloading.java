public class Overloading{
    public static void main(String[] args) {
        fun("jitesh");
        fun("Raj" , 89);
        fun(3, 3.4);
        fun(89, 2);
        fun(7, 3, 1);
        fun(3, 2, 1);
    }


    static void fun(int a , int b) {
        System.out.println( a +  " " + b);
    }

    static void fun(int f , double   g) {
        System.out.print( f + " ");
        System.out.println( g);
    }

    static void fun(int a , int b, int c ) {
    System.out.println( a +" "+ b + " " + c);
    }

    static void fun(String name) {
        System.out.println(name);
    }

    static void fun(String name , int a) {
    System.out.println(name + " " + a);
    }
    
     // it's not valid 
    //     static void multiple (String ...v, int a) {}
    // valid rule
    //     static void multiple (nt a, String ...v, i) {}

}
