package homework6;

public class Calculator {
    double result=0.0;

    public Double calculate(double a, double b, char op){
        if(b!=0){
            switch (op){
                case '*':
                    result=a*b;
                    break;
                case '/':
                    result=a/b;
                    break;
                case '+':
                    result=a+b;
                    break;
                case '-':
                    result=a-b;
                    break;
                default:
                    return null;
            }
        }else return Double.NaN;
        return result;
    }
}
