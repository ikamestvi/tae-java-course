package homework7;

public class Circle implements Shape{
    private int radius;

    public Circle(int radius){
        this.radius=radius;
    }


    @Override
    public double area(){
        double num=Math.PI*radius*radius;
        return Math.round(num * 100.0) / 100.0;
    }
}
