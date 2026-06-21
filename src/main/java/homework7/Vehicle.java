package homework7;

public abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand){
        this.brand=brand;
    }


    abstract String start();


    String stop(){
        return brand + " stopped";
    }
}
