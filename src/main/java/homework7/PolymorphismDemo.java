package homework7;

public class PolymorphismDemo {
    public static void main(String[] args) {
        //დავალება 3
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


         //output-ში დავალებების მარტივად წასაკითხად
        System.out.println();

         //დავალება 4
        Drawable[] drawables= {
                 new Square(),
                new Triangle(),
                new Star()
        };


         for(Drawable drawable : drawables){
             if(drawable instanceof Square){
                 drawable.draw();
             } else if (drawable instanceof Triangle) {
                 drawable.draw();
             } else if (drawable instanceof Star) {
                 drawable.draw();
             }
         }


    }
}