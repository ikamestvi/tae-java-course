package homework9;

import java.util.ArrayList;

public class ListUtilities {
    public <T> void printArr(T[] array){
        for(T value : array){
            System.out.print(value + " ");
        }
    }

    public <T> T getFirst(T[] array){
        return  array[0];
    }
}
