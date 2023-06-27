import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        boolean isPrime;

        System.out.print("Sayı giriniz: ");
        num = input.nextInt();

        for (int i = 2; i <= num; i++) {
            isPrime = true;

            for (int k = 2; k < Math.sqrt(i) + 1; k++) {

                if (i % k == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }

        }
        input.close();
    }
}
