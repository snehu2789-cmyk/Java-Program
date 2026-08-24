public class Arrays{
    public static void main(String[] args) {
        
        //Q: store a roll no:
        int rolln = 7;
        // Q: store a name:
        String name = "Jitesh Yadav";
        
        // Q: store 5 roll no :
        int roll1 = 23;
        int roll2 = 45;
        int roll3 = 45;
        int roll4 = 45;

        // Arrays store only same data type values in one variable 
        // Sytanx :
        // datatype[] variable_name = new datatype[size];
        // store 5 roll no:
        // int[] rollno = new int[5];
        // // or directory
        // int[] rollno2 = {23,12,45,32,15};

        int[] ros; // declaration: of aray ros to geeting defined in the stack
        ros = new int[5]; // initialsation: acctually here object is being created in the memory (heap)
        
//        System.out.println(ros[0]); // gives s values a 0 because array don't conatain values
        
        String[] arr = new String[4];
        System.out.println(arr[0]);   // gives null value
    }
}