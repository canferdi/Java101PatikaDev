import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number1, number2;
        int select;

        System.out.print("Lütfen 1. sayıyı giriniz: ");
        number1 = input.nextDouble();

        System.out.print("Lütfen 2. sayıyı giriniz: ");
        number2 = input.nextDouble();

        System.out.println("1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        input.close();

        switch (select) {

            case 1:
                System.out.println(number1 + number2);
                break;

            case 2:
                System.out.println(number1 - number2);
                break;

            case 3:
                System.out.println(number1 * number2);
                break;

            case 4:
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("Geçersiz işlem!");
        }

    }
}
