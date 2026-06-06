package homework4;

public class EvenOddCounter {
    public static void main(String[] args) {
        int birthYear=1995;
        int lastTwo = birthYear % 100;
        int counterOdd=0;
        int counterEven=0;


        if(birthYear>0){
            for(int i=1; i<=lastTwo; i++){
                if(i%2==0){
                    counterEven++;
                } else if (i%2!=0) {
                    counterOdd++;
                }
            }
        }
        else System.out.println("რიცხვი უნდა იყოს დადებითი");


        System.out.println("ლუწი რიცხვების რაოდენობა: " + counterEven);
        System.out.println("კენტი რიცხვების რაოდენობა: " + counterOdd);
    }
}
