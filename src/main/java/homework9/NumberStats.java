package homework9;
import java.util.ArrayList;


public class NumberStats {
    ArrayList<Integer> numArr = new ArrayList<>();


    public void setNumber(int number){
        numArr.add(number);
    }


    public int findMax(){
        try{
            int max= numArr.get(0);

            for(int num : numArr){
                if(num>max){
                    max=num;
                }
            }

            return max;
        }catch (IndexOutOfBoundsException e){
            System.out.println("სია ცარიელია");
            return 0;
        }
    }


    public int findMin(){
        try{
            int min=numArr.get(0);

            for(int num : numArr){
                if(num<min){
                    min=num;
                }
            }
            return min;
        }catch(IndexOutOfBoundsException e){
            System.out.println("სია ცარიელია");
            return 0;
        }
    }



    public double average(){
        double sum=0;

        try{
            for(int num : numArr){
                sum+=num;
            }
            return sum/numArr.size();
        }catch (IndexOutOfBoundsException e){
            System.out.println("სია ცარიელია");
            return 0;
        }
    }
}
