package homework8;

public class NullCheck {
    public int safeLength(String s){
        try{
            return s.length();
        }catch (NullPointerException e){
            System.out.println("null სტრიქონი");
            return 0;
        }
    }
}
