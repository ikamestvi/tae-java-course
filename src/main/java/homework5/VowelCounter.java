package homework5;

public class VowelCounter {
    /*
    დაწერე მეთოდი
int countVowels(String s), რომელიც გადადის ციკლით სტრიქონის ყოველ ასოზე და
switch-ით ამოწმებს ხმოვანია თუ არა (a, e, i, o, u). გადააქცი ასო lowercase-ში (
main()-ში გადაეცი თქვენი სრული სახელი.
მაგ.countVowels("Hello World") → 3 (e, o, o)
     */


    public static int countVowels(String s) {
        int vowelCount=0;

        for (int i = 0; i < s.length(); i++) {
            switch (Character.toLowerCase(s.charAt(i))) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
                default:
                    break;
            }
        }
        return vowelCount;
    }



    public static void main(String[] args) {
        System.out.println(countVowels("irakli"));
    }
}
