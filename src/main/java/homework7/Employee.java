package homework7;

abstract class Employee {
    protected String name;

    public Employee(String name){
        this.name=name;
    }


    abstract double calculateSalary();

    void printInfo(){
        System.out.println(name);
    }
}
