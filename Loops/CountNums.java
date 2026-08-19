public class CountNums{
    public static void main(String[] args) {
        int num = 8408283;
        int count = 0;
        while (num >0){
            int rem = num % 10;
            if (rem == 8){
                count ++;
            }
            num = num/10;
        }
        System.out.println(num + "occur " + count +" times.");
    }
}