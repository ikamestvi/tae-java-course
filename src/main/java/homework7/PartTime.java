package homework7;

public class PartTime extends Employee{
    private double hourlyRate;
    private double hoursWorked;


    public PartTime(String name, double hourlyRate, double hoursWorked){
        super(name);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    @Override
    double calculateSalary(){
        return  hourlyRate*hoursWorked;
    }
}
