import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight, height, bmi;

        System.out.print("Kilonuzu giriniz: ");
        weight = input.nextDouble();

        System.out.print("Boyunuzu giriniz(m): ");
        height = input.nextDouble();

        bmi = weight / (height * height);

        System.out.println("Kilonuz: " + weight + "kg");
        System.out.println("Boyunuz: " + height + "m");
        System.out.println("Beden kitle indeksiniz: " + bmi);
        input.close();
    }
}
