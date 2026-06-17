package homework9;

public class GenericBox<T> {
    private T value;

    public GenericBox(T value){
        this.value=value;
    }


    public T getBox(){
        return value;
    }


    public void setBox(T value){
        this.value=value;
    }
}
