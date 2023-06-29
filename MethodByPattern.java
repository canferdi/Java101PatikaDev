import java.util.Scanner;

public class MethodByPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Pozitif sayı giriniz: ");
        number = input.nextInt();

        if (number > 0) {
            negatifePattern(number, number);

        } else {
            System.out.println("Lütfen pozitif sayı giriniz.");
        }
        input.close();
    }

    static int positivePattern(int number, int oldNumber) {
        System.out.println(number);

        if (oldNumber == number) {
            return 1;

        } else {
            return positivePattern(number + 5, oldNumber);
        }

    }

    static int negatifePattern(int number, int oldNumber) {
        System.out.println(number);

        if (number <= 0) {
            return positivePattern(number + 5, oldNumber);

        } else {
            return negatifePattern(number - 5, oldNumber);
        }

    }
}
