package homework6;

public class Counter {
    private int count;
    private int maxValue=100;


     void  increment(){
        if(count<maxValue){
            count+=1;
        }
     }


     void reset(){
        count=0;
     }


     void countTo(int target){
        for(int i=1;i<=target; i++){
            increment();
        }
     }


    public int getCount(){
        return count;
    }
}
