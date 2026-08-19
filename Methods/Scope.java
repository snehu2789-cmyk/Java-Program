public class Scope{
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        // anything that can be initalize in the method cannot be initalized again in the same method
        // anything that initalize in the block can be access in that block only not outside
        // but anything that already initalized inside the block that can again initalized outside of that block
        
        {
        // already initialsied outside the block in the same method ,hence you cannot intialise value again
         // int a= 45  
            a = 100 ;  // but can modified orginas ref value to some other value
            int c = 98;
            // values initalised int his block , will remain in block
        }
        //System.out.println(c); // also cannot be accessed out the block
        System.out.println(a);

        // scoping in for loop:
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            System.out.println(num);

        }
        
       // System.out.println(i); // throw error bcz calling outside of block
    }


    // scope can be accessed only inside the method variable only
    static void random(int marks) {
        int num = 86;
        System.out.println(num);
        System.out.println(marks);
    }
}