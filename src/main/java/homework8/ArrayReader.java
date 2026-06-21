package homework8;

public class ArrayReader {
    public int readSafe(int[] arr, int index){
        try{
            return arr[index];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ინდექსი არასწორი: "+ index);
            return -1;
        }
    }
}
