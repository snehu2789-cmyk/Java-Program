public class Shadowing{
    static int x =80; // this will shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x); //80
        int x ; // the class variable at line 2 is shadowed by this
//      System.out.println(x); // scope will begin when value is initialised
        x = 40;
        System.out.println(x); // 40
        fun();
        x = 89;
        System.out.println(x);
    }

        static void fun(){
            System.out.println(x);
        }
}