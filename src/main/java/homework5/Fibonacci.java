package homework5;

public class Fibonacci {
    public static long fib(int n){
        long previous = 0;
        long current = 1;

        for (int i = 2; i <= n; i++) {
            long next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }


    public static void main(String[] args) {
        int fibonacciNumber=20;

        System.out.println("fib("+fibonacciNumber+") → "+fib(fibonacciNumber));

        //fib(10) → 55
    }
}
