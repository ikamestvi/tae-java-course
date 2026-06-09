package homework7;

public class Car extends Vehicle{
    public Car(String brand){
        super(brand);
    }


    @Override
    public String start(){
         return brand +" engine started";
    }
}
