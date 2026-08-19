public class Swap{
    public static void main(String[] args) {
        int a = 32;
        int b = 20;
        
        //swap numbers code
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

        String name = "Sneha Das";
        ChangeName(name);
        System.out.println(name);

        //System.out.println(swap(89, 54));
        
    }
    static void ChangeName(String name) {
        name = "Saurab yadav"; // creating a new object
        System.out.println(name);
    }

    static void swap(int num1 , int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // it will create new object that's why changes will be only inside scope.
        // this change will only be valid in this function scope only.
    }
}