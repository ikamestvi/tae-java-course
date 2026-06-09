package homework7;

public class PolymorphismDemo {
    public static void main(String[] args) {
         Animal[] animals={
                 new Dog("jeka"),
                 new Dog("dzagluka"),
                 new Cat("doomSlayer"),
                 new Cat("trevor")
         };


         for(Animal animal : animals){
             String type="";

             if(animal instanceof Dog){
                 type="Dog";
             } else if (animal instanceof  Cat) {
                 type="Cat";
             }
             System.out.print(animal.name+ " (" + type + "): ");
             animal.makeSound();
             animal.sleep();
         }
    }
}