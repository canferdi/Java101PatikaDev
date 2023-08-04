import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int right = 5, selected;
        int number = random.nextInt(1, 100);
        int[] guess = new int[right];
        boolean isWin = false;
        System.out.println(number);

        while (right > 0) {

            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 aralığında bir değer giriniz.");
                System.out.println("Kalan hakkınız : " + right);
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin! Sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz!");
                if (selected > number) {
                    System.out.println("Sayı girdiğinizden daha küçüktür.");
                } else {
                    System.out.println("Sayı girdiğinizden daha büyüktür.");
                }
            }
            right--;
            System.out.println("Kalan hakkınız : " + right);
            guess[4 - right] = selected;

        }
        if (!isWin) {
            System.out.println("Kaybettiniz!");
            System.out.println("Tahminleriniz : " + Arrays.toString(guess));
        }

        input.close();
    }

}