import java.util.Scanner;

public class PrimeNumbersRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, divider;

        System.out.print("Sayı giriniz: ");
        number = input.nextInt();
        divider = number - 1;

        if (number > 1) {
            if (primeNum(number, divider)) {
                System.out.println("asal");

            } else {
                System.out.println("asal değil");
            }

        } else {
            System.out.println("Hatalı sayı girişi.");
        }
        input.close();
    }

    static boolean primeNum(int number, int divider) {

        if (divider == 1) {
            return true;

        } else if (number % divider == 0) {
            return false;

        } else {
            return primeNum(number, divider - 1);
        }

    }
}
