package homework5;

public class NumberClassifier {
    public static String classify(int n) {
        if(n>0){
            return "Positive";
        } else if (n<0) {
            return "Negative";
        }else return "Zero";
    }


    public static String classify(double n) {
        if(n%2==0){
            return "Whole double";
        } else if (n%2!=0) {
            return "Decimal";
        }else return "Invalid";
    }



    public static void main(String[] args) {
        System.out.println(classify(56));
        System.out.println(classify(-45));
        System.out.println(classify(0));
        System.out.println(classify(4.00));
        System.out.println(classify(9.15));
    }
}
