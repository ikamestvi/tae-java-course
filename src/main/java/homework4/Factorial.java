package homework4;

public class Factorial {
    public static void main(String[] args) {
        int monthNumber=2;
        int factorial=1;
        int i=1;
        String month="";

        switch (monthNumber){
            case 1:
                month="იანვარი";
                break;
            case 2:
                month="თებერვალი";
                break;
            case 3:
                month="მარტი";
                break;
            case 4:
                month="აპრილი";
                break;
            case 5:
                month="მაისი";
                break;
            case 6:
                month="ივნისი";
                break;
            case 7:
                month="ივლისი";
                break;
            case 8:
                month="აგვისტო";
                break;
            case 9:
                month="სექტემბერი";
                break;
            case 10:
                month="ოქტომბერი";
                break;
            case 11:
                month="ნოემბერი";
                break;
            case 12:
                month="დეკემბერი";
                break;
        }


        while(i<=monthNumber){
            factorial*=i;
            i++;
        }

        System.out.println(month+" = "+monthNumber+":"+monthNumber+"!"+" = "+factorial);

        //დაბადების თვე = 7:7! = 1 × 2 × 3 × 4 × 5 × 6 × 7 = 5040
    }
}
