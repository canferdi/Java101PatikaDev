import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base, exponent, result = 1;

        System.out.print("Üssü alınacak sayı: ");
        base = input.nextInt();
        System.out.print("Sayının üssü: ");
        exponent = input.nextInt();

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç: " + result);
        input.close();
    }

}
