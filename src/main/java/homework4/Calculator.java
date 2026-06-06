package homework4;

public class Calculator {
    public static void main(String[] args) {
        double number1=4;
        double number2=2;
        char symbol='+';


        switch(symbol){
            case '*':
                System.out.println(number1*number2);
                break;
            case '/':
                if(number2!=0){
                    System.out.println(number1/number2);
                    break;
                }
                System.out.println("ნულზე გაყოფა აკრძალულია");
                break;
            case '+':
                System.out.println(number1+number2);
                break;
            case '-':
                System.out.println(number1-number2);
                break;

            default:
                System.out.println("უცნობი ოპერატორი");
        }
    }
}
