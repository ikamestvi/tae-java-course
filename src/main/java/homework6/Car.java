package homework6;

public class Car extends Vehicle{
    private int doors;

    public Car(String brand, int year, int doors){
        super(brand, year);
        this.doors=doors;
    }


    //@Override info() — ბეჭდავს brand, year და doors
    @Override
    public void info(){
        System.out.println("ბრენდი: " + brand);
        System.out.println("წელი: " + year);
        System.out.println("კარების რაოდენობა: " + doors);
    }
}
