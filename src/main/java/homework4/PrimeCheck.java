package homework4;

public class PrimeCheck {
    public static void main(String[] args) {
        int age = 1;
        int ageLength = String.valueOf(age).length();
        boolean isPrime = true;

        for (int i = ageLength; i < age; i++) {
            if (age % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("ასაკი = " + age + " → მარტივია.");
        } else {
            System.out.println("ასაკი = " + age + " → არ არის მარტივი (იყოფა 2, 3, 4, 6, 8, 12-ზე)");
        }
    }
}
