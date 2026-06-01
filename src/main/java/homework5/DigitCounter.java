package homework5;

public class DigitCounter {
    public static int countDigits(int n) {
        int i=0;

        while(n!=0){
            n=n/10;
            i++;
        }
        return i;
    }


    public static void main(String[] args) {
        System.out.println(countDigits(01671));
    }
}
