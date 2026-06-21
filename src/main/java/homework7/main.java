package homework7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        //დავალება 1
        Shape s1 = new Rectangle(4, 5);
        System.out.println(s1.area());

        Shape s2 = new Circle(3);
        System.out.println(s2.area());




        //დავალება 2
        System.out.println();
        Dog d = new Dog("Rex");
        d.makeSound();
        d.sleep();



        //დავალება 5
        System.out.println();
        Book bk1=new Book("Java");
        Book bk2=new Book("Java", "Bloch");
        Book bk3=new Book("Java", "Bloch", 2020);
        System.out.println(bk1.toString());
        System.out.println(bk2.toString());
        System.out.println(bk3.toString());



        //დავალება 6
        System.out.println();
        String resultCar = new Car("Toyota").start();
        String resultBike = new Bike("suzuki").stop();
        System.out.println(resultCar);
        System.out.println(resultBike);


        //დავალება 7
        System.out.println();
        Person[] persons = {
                new Person("irakli", 30),
                new Person("koba", 83),
                new Person("soso", 20),
                new Person("hirohito", 19)
        };

        Arrays.sort(persons);

        for(Person person : persons){
            System.out.println(person);
        }




        //დავალება 8
        System.out.println();
        Employee[] team = {
                new FullTime("anna", 5000),
                new PartTime("Beka", 25 , 80)
        };


        for(Employee e : team){
            e.printInfo();
            System.out.println(e.calculateSalary());
        }
    }
}
