import java.util.Scanner;

public class ExponentiationRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, exp;

        System.out.print("Taban: ");
        base = input.nextInt();
        System.out.print("Üs   : ");
        exp = input.nextInt();

        System.out.println("Sonuç: " + exp(base, exp));
        input.close();
    }

    static int exp(int base, int exp) {
        if (exp == 0) {
            return 1;
        }

        return base * exp(base, exp - 1);
    }
}
