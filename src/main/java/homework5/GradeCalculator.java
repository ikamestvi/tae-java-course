package homework5;

public class GradeCalculator {
    // მეთოდი — static, რომ main()-დან გამოვიძახოთ
    public static String getGrade(int score) {
        if (score >=0 && score <=100){
            if(score>=90){
                return "A";
            } else if (score>=80 && score<=89) {
                return "B";
            } else if (score>=70 && score<=79) {
                return "C";
            } else if (score>=60 && score<=69) {
                return "D";
            }else return "F";
        }
        return "Invalid";
    }

    public static void main(String[] args) {
        System.out.println(getGrade(64));

    }
}
