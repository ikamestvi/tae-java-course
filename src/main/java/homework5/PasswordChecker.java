package homework5;

public class PasswordChecker {
    public static boolean isStrong(String password) {
        boolean hasDigits=false;
        boolean hasUppercase=false;
        int stringLength=password.length();

        for(int i=0;i<stringLength;i++){
            char sym = password.charAt(i);

            hasDigits |= Character.isDigit(sym);
            hasUppercase |= Character.isUpperCase(sym);
        }
        return stringLength >=8 && hasDigits && hasUppercase;
    }


    public static void main(String[] args) {
        System.out.println(isStrong("iR000789"));
    }
}
