import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        if (number > 0) {
            System.out.println(fibo(number));

        } else {
            System.out.println("Lütfen pozitif tamsayı giriniz.");
        }

        input.close();
    }

    static int fibo(int number) {

        if (number == 1 || number == 2) {
            return 1;
        }

        return fibo(number - 1) + fibo(number - 2);
    }
}
