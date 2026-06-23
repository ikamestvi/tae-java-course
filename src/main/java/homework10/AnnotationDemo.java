package homework10;

public class AnnotationDemo {
    @AuthorAnnotation(name="ika")
    public void printName(){
        System.out.println("პირველი მეთოდი");
    }


    @AuthorAnnotation(name ="jeka", date="2026" )
    public void printStatus(){
        System.out.println("მეორე მეთოდი");
    }
}
