public class Conditionals{
    public static void main(String[] args) {
        /*
        sytax of if else statemetn;
        if (boolean ecpression T or F){
            body if 
        }else {
            do this if Fasle
        }
        */
    //    int salary = 25000;
    //    if (salary > 10000) {
    //     salary = salary + 2000;
    //    } else{
    //     salary = salary + 1000;
    //    }
    //    System.out.println("Salary " + salary);
    
    
    // multiple if-else 
    int salary = 24000;
    if (salary > 10000){
        salary += 2000;
    } else if (salary > 20000){
        salary += 3000;
    }else{
        salary += 1000;
    }
    System.out.println("Salary = "+ salary);

    }
}