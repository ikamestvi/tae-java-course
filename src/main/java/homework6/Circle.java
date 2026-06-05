package homework6;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }


    @Override
    public double area(){
        double result=Math.PI*radius*radius;
        return Math.round(result*100.0)/100.0;
    }
}
