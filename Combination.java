import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Kombinasyon C(n) sayısını giriniz: ");
        num1 = input.nextInt();
        System.out.print("Kombinasyon C(r) sayısını giriniz: ");
        num2 = input.nextInt();

        System.out.println("Kombinasyon: " + fact(num1) / (fact(num2) * fact(num1 - num2)));
        input.close();
    }

    public static int fact(int number) {
        int total = 1;

        for (int i = 1; i <= number; i++) {
            total *= i;

        }

        return total;
    }

}
