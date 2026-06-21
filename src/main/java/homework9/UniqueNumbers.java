package homework9;

import java.util.HashSet;

public class UniqueNumbers {
    private HashSet<Integer> numbers=new HashSet<>();


    public void addNumber(int number){
        numbers.add(number);
    }


    public void printUniq(){
        for(Integer number : numbers){
            System.out.print(" "+number);
        }
    }


    public int getSize(){
        return numbers.size();
    }


    public boolean contains(int number){
        return numbers.contains(number);
    }
}
