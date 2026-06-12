package homework8;

public class AgeValidator {
    public void validate(int age) throws InvalidAgeException{
        if(age<0 || age>150){
            throw new InvalidAgeException("არავალიდური ასაკი.");
        }
        System.out.println("ok");
    }
}
