package homework8;

public class FinallyDemo {
    /*
    დაწერე მეთოდი  int readNumber(String s): try-ში — Integer.parseInt(s). catch-ში —
NumberFormatException → ბეჭდე შეცდომა და დააბრუნე -1. finally-ში დაბეჭდე „დასრულდა
readNumber" (ყოველთვის). main()-ში გამოცადე ორი ცდით: "100" და "xyz" — შეადარე რა ჯერ იბეჭდება
ერთშიც და მეორეშიც.
     */

    public int readNumber(String s){
        try{
            return Integer.parseInt(s);
        }catch (NumberFormatException e){
            return  -1;
        }finally {
            System.out.println("დასრულდა readNumber");
        }
    }
}
