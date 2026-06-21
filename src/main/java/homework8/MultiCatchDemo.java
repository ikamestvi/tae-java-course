package homework8;

public class MultiCatchDemo {
    /*
    დაწერე მეთოდი
void processInput(String input), რომელიც:
1) Integer.parseInt(input) - გადააქცევს რიცხვად;
2) აპურს int[] arr = {10, 20}; 3) აბრუნებს arr[result] / result.
სამი catch ბლოკი —
NumberFormatException,
ArrayIndexOutOfBoundsException,
ArithmeticException.
თითო catch-ში სხვადასხვა შეტყობინება.
მაგ.processInput("abc") → NumberFormatException processInput("0") → ArithmeticException
processInput("99") → ArrayIndexOutOfBoundsException
     */

    public void processInput(String input){
        try{
            int res=Integer.parseInt(input);
            int[] arr = {10, 20};
            int finalRes=arr[res]/res;
            System.out.println(finalRes);
        }catch (NumberFormatException e){
            System.out.println("ტექსტი არ არის მთელი რიცხვი");
        }catch (ArithmeticException e){
            System.out.println("ინდექსი მასივში არ არსებობს");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ნულზე გაყოფა შეუძლებელია");
        }
    }
}
