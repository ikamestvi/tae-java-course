package homework9;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //1 დავალება
        NamesList container=new NamesList();

        ////სახელების დამატება მასივში
        container.addName("ika");
        container.addName("jeka");
        container.addName("anna");
        container.addName("ado");
        container.addName("bashi");


        ////მასივის ზომა, პირველ ინდექსში რა წერია, ბოლო ინდექსში რა წერია
        System.out.println("მასივის ზომა: "+container.getSize());
        System.out.println("პირველ ინდექსზე: "+container.getFirst());
        System.out.println("ბოლო ინდექსზე: "+container.getlast());

        ////შეიცავს თუ არა სახელს
        String name="anna";
        System.out.println("არსებობს სახელი ? - "+container.contains(name));

        ////წაშლა და კიდევ ერთხელ შემოწმება
        container.removeName(2);
        System.out.println("არსებობს სახელი ? - "+container.contains(name));


        ////ყველა სახელი
        System.out.println("სახელები: ");
        container.printAllNames();




        //2 დავალება
        System.out.println();
        UniqueNumbers num=new UniqueNumbers();
        int[] arr={1, 2, 3, 2, 4, 1, 5};
        int[] arrCheck={3, 10};

        for(int i=0; i<arr.length;i++){
            num.addNumber(arr[i]);
        }

        ////უნიკალურები
        System.out.print("Unique: [");
        num.printUniq();
        System.out.print("]");

        ///ზომა
        System.out.println(" size: "+num.getSize());

        ////შემოწმება
        for(int i=0; i<arrCheck.length; i++){
            System.out.println("Contains " + arrCheck[i] + "? " + num.contains(arrCheck[i]));
        }



        //3 დავალება
        System.out.println();
        PhoneBook personPhone=new PhoneBook();
        personPhone.putPhone("ika", "555444777");
        personPhone.putPhone("jeka", "000111222");

        System.out.println(personPhone.findPhone("ika"));
        System.out.println(personPhone.findPhone("terminator"));

        for(String namePhone : personPhone.phones.keySet()){
            String number=personPhone.phones.get(namePhone);
            System.out.println("სახელი: " + namePhone + " -> ნომერი: " + number);
        }




        //4 დავალება
        System.out.println();
        NumberStats numbStat=new NumberStats();
        numbStat.setNumber(8);
        numbStat.setNumber(5);
        numbStat.setNumber(3);
        numbStat.setNumber(2);
        numbStat.setNumber(6);

        System.out.println("მაქსიმალური რიცხვი: "+numbStat.findMax());
        System.out.println("მინიმალური რიცხვი: "+numbStat.findMin());
        System.out.println("საშუალო რიცხვი: "+numbStat.average());



        //5 დავალება
        System.out.println();
        WordCounter text = new WordCounter();
        String txt="java git java oop java git python";
        text.countWords(txt);



        //6 დავალება
        System.out.println();
        GenericBox<String> stringBox = new GenericBox<>("Hello");
        System.out.println(stringBox.getBox());

        GenericBox<Integer> integerBox = new GenericBox<>(42);
        System.out.println(integerBox.getBox());


        GenericBox<Double> doubleBox= new GenericBox<>(3.14);
        System.out.println(doubleBox.getBox());

        ////setter method
        stringBox.setBox("how are u?");
        System.out.println(stringBox.getBox());




        //7 დავალება
        System.out.println();
        String[] stringArray={"a", "b", "c", "d", "e"};
        ListUtilities stringExample= new ListUtilities();
        stringExample.printArr(stringArray);
        System.out.println("მასივის პირველი ჩანაწერი: "+stringExample.getFirst(stringArray));

        System.out.println();
        Integer[] integerArray={2, 5, 6, 9, 3, 1};
        ListUtilities integerExample = new ListUtilities();
        integerExample.printArr(integerArray);
        System.out.println("მასივის პირველი ჩანაწერი: "+ integerExample.getFirst(integerArray));



        //8 დავალება
        StudentGrades student = new StudentGrades();
        student.setStudent("ika", Arrays.asList(2, 3, 5, 10));
        student.setStudent("ana", Arrays.asList(1, 2, 3, 4));
        student.setStudent("koba", Arrays.asList(10, 5, 1, 4));

        for(String studName : student.getStudentGrades().keySet()){
            double avg=student.avarageFor(studName);
            System.out.println(studName+ ": "+student.getStudentGrades().get(studName) + " avg="+avg);
        }
    }
}
