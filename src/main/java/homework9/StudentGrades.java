package homework9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGrades {
      private HashMap<String, List<Integer>> students;


      public StudentGrades(){
          this.students=new HashMap<>();

      }

      public void setStudent(String studentName, List<Integer> grades){
          students.put(studentName, grades);
      }


      public double avarageFor(String name){
          if(!students.containsKey(name) || students.get(name).isEmpty()){
              return 0.0;
          }

          List<Integer> grades = students.get(name);
          double sum=0;
          for(int grade : grades){
              sum+=grade;
          }

          return sum/grades.size();
      }


      public HashMap<String, List<Integer>> getStudentGrades(){
          return students;
    }
}
