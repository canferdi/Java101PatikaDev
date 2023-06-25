import java.util.Scanner;

public class Mod3Mod4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Lütfen sayı giriniz: ");
        number = input.nextInt();

        System.out.println("3'e ve 4'e tam bölünebilen sayılar: ");
        for (int i = 0; i <= number; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);

            }

        }

    }

}