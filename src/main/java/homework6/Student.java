package homework6;

public class Student {
    private String name;
    private int[] grades;
    private double sum;
    private double avarageResult;


    public Student(String name, int[] grades){
        this.name=name;
        this.grades=grades;
    }

    public double avarageGrade(){
        for(int i=0; i<grades.length; i++){
            sum+=grades[i];
        }
        avarageResult=sum/ grades.length;
        return avarageResult;
    }


    public String getStatus(){
        if(avarageResult>=60.0){
            return "Pass";
        }else return "Fail";
    }
}
