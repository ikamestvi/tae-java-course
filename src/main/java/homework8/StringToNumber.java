package homework8;

public class StringToNumber {
    public int parseSafe(String s){
        try{
            return Integer.parseInt(s);
        }catch (NumberFormatException e){
            System.out.println("არ არის რიცხვი: " + s);
            return 0;
        }
    }
}
