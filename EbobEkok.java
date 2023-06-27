import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ebob = 1, ekok, num1, num2, minNum;

        System.out.print("1. sayıyı giriniz: ");
        num1 = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        num2 = input.nextInt();

        minNum = (num1 < num2) ? num1 : num2;

        for (int i = minNum; i > 0; i--) {

            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
                break;
            }
        }

        ekok = (num1 * num2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

        input.close();

    }
}