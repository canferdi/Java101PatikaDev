import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = 0, num2 = 0, select;

        while (true) {
            String menu = "1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme işlemi\n"
                    + "5- Üslü Sayı Hesaplama\n"
                    + "6- Faktoriyel Hesaplama\n"
                    + "7- Mod Alma\n"
                    + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "0- Çıkış Yap";

            System.out.println(menu);
            System.out.print("Seçiminiz: ");
            select = input.nextInt();

            if (select == 0) {
                System.out.println("Çıkış yapılıyor...");
                break;
            }

            if (select == 6) {
                System.out.print("Sayı giriniz: ");
                num1 = input.nextInt();

            } else {
                System.out.print("1. sayıyı giriniz: ");
                num1 = input.nextInt();
                System.out.print("2. sayıyı giriniz: ");
                num2 = input.nextInt();
            }

            switch (select) {
                case 1:
                    sum(num1, num2);
                    break;
                case 2:
                    minus(num1, num2);
                    break;
                case 3:
                    times(num1, num2);
                    break;
                case 4:
                    divide(num1, num2);
                    break;
                case 5:
                    exp(num1, num2);
                    break;
                case 6:
                    fact(num1);
                    break;
                case 7:
                    mod(num1, num2);
                    break;
                case 8:
                    rectangle(num1, num2);
                    break;
                default:
                    System.out.println("Hatalı işlem!");
                    break;
            }
            System.out.println("--------------------");
        }
        input.close();
    }

    static void sum(int num1, int num2) {
        System.out.println("Toplama: " + (num1 + num2));
    }

    static void minus(int num1, int num2) {
        System.out.println("Çıkarma: " + (num1 - num2));
    }

    static void times(int num1, int num2) {
        System.out.println("Çarpma: " + (num1 * num2));
    }

    static void divide(int num1, int num2) {
        if (num2 != 0) {
            System.out.println("Bölme: " + (num1 / num2));

        } else {
            System.out.println("Sıfıra bölünemez!!!");
        }
    }

    static void exp(int num1, int num2) {
        int result = 1;

        for (int i = 1; i <= num2; i++) {
            result *= num1;
        }
        System.out.println(result);
    }

    static void fact(int num1) {
        int result = 1;
        for (int i = 1; i <= num1; i++) {
            result *= i;
        }
        System.out.println("Faktöriyel: " + result);

    }

    static void mod(int num1, int num2) {
        System.out.println("Mod: " + (num1 % num2));

    }

    static void rectangle(int num1, int num2) {
        System.out.println("Alan: " + (num1 * num2));
        System.out.println("Çevre: " + ((num1 + num2) * 2));
    }
}
