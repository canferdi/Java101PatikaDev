import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number, total = 0;

        System.out.print("Hesaplanmasını istediğiniz harmonik sayı: ");
        number = input.nextInt();

        for (double i = 1; i <= number; i++) {

            total += 1 / i;
        }

        System.out.println("Toplam: " + total);

        input.close();
    }
}
