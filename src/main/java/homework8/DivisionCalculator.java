package homework8;

public class DivisionCalculator {

    public int safeDivide(int a, int b) {
        try {
            return a/b;
        } catch (ArithmeticException e) {
            System.out.print("ნულზე გაყოფა, ");
            return 0;
        }
    }
}
