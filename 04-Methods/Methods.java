public class Methods{
    public static void main(String[] args){
        String message = greet();
        System.out.println("Message  " + message);
        System.out.println(greet(" Sneha "));
    }
        static  String greet(){
        return "Hello how are you?";
        }

    // pass the value of numbers when you are calling the method to main()
        static  String greet(String name){
        return "Hello" + name;
        }
/*
    return_type name(arguments){
    // body
    return statement
    }
    non return type 
    static void sum(arguments){
    // body
    }
 */
   
}