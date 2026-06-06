package homework4;

public class GradeCalculator {
    public static void main(String[] args) {
        int birthMonth=13;


        if(birthMonth==12){
            System.out.println("დაბადების თვე = "+birthMonth+" → შეფასება „A\"");
        } else if (birthMonth>=9&&birthMonth<=11) {
            System.out.println("დაბადების თვე = "+birthMonth+" → შეფასება „B\"");
        } else if (birthMonth>=6&&birthMonth<=8) {
            System.out.println("დაბადების თვე = "+birthMonth+" → შეფასება „C\"");
        } else if (birthMonth>=3&&birthMonth<=5) {
            System.out.println("დაბადების თვე = "+birthMonth+" → შეფასება „D\"");
        } else if (birthMonth>=1&&birthMonth<=2) {
            System.out.println("დაბადების თვე = "+birthMonth+" → შეფასება „F\"");
        }else System.out.println("დაბადების თვე არასწორია");
    }
}
