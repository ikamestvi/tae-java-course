package homework9;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //1 დავალება
        NamesList container=new NamesList();

        //სახელების დამატება მასივში
        container.addName("ika");
        container.addName("jeka");
        container.addName("anna");
        container.addName("ado");
        container.addName("bashi");


        //მასივის ზომა, პირველ ინდექსში რა წერია, ბოლო ინდექსში რა წერია
        System.out.println("მასივის ზომა: "+container.getSize());
        System.out.println("პირველ ინდექსზე: "+container.getFirst());
        System.out.println("ბოლო ინდექსზე: "+container.getlast());

        //შეიცავს თუ არა სახელს
        String name="anna";
        System.out.println("არსებობს სახელი ? - "+container.contains(name));

        //წაშლა და კიდევ ერთხელ შემოწმება
        container.removeName(2);
        System.out.println("არსებობს სახელი ? - "+container.contains(name));


        //ყველა სახელი
        System.out.println("სახელები: ");
        container.printAllNames();
    }
}
