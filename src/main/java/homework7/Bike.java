package homework7;

public class Bike extends Vehicle{
    public Bike(String brand){
        super(brand);
    }


    @Override
    public String start(){
        return brand +" engine started";
    }
}
