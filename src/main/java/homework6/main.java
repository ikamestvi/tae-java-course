package homework6;

public class main {
    public static void main(String[] args) {
        Person person= new Person("ირაკლი",30, "irakli@mail.com");
        System.out.println(person.getName());
        person.introduce();
    }
}
