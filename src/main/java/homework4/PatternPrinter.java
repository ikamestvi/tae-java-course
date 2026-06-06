package homework4;

public class PatternPrinter {
    public static void main(String[] args) {
        String name="irakli";
        int nameLength=6;


        for(int i=nameLength; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
