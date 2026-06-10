package homework5;

public class SumEvens {
    public static int sumEvens(int from, int to) {
        int resultNumber=0;

        for(int i=from; i<=to; i++){
            if(i%2==0){
                resultNumber+=i;
            }
            continue;
        }
        return resultNumber;
    }

    public static void main(String[] args) {
        System.out.println(sumEvens(1, 10));

    }
}
