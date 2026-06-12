package homework8;

public class InputValidator {
    public int processAge(String input) throws NumberFormatException, IllegalArgumentException{
        int age= Integer.parseInt(input);

        if(age<0){
            throw new IllegalArgumentException("ასაკი არ შეიძლება უარყოფითი იყოს");
        }
        return age*12;
    }
}
