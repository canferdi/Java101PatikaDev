import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, total = 0;

        System.out.print("Sayı giriniz: ");
        num = input.nextInt();

        for (int i = num - 1; i > 0; i--) {

            if (num % i == 0) {
                total += i;
            }
        }
        
        if (total == num) {
            System.out.println(num + " Mükemmel sayıdır.");

        } else {
            System.out.println(num + " Mükemmel sayı değildir.");
        }

        input.close();
    }
}
