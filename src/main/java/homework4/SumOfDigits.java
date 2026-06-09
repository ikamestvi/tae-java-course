package homework4;

public class SumOfDigits {
    public static void main(String[] args) {
        int birthYear = 2052;
        int resultNumber = 0;



        while (birthYear > 0) {
            resultNumber += birthYear % 10;
            birthYear /= 10;
        }

        System.out.println(resultNumber);
    }
}
