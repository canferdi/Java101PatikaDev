import java.util.Scanner;

public class Greengrocer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ARMUT = 2.14, ELMA = 3.67, DOMATES = 1.11, MUZ = 0.95, PATLICAN = 5, total;
        int armutKg, elmaKg, domatesKg, muzKg, patlıcanKg;

        System.out.print("Kaç kilo armut?: ");
        armutKg = input.nextInt();

        System.out.print("Kaç kilo elma?: ");
        elmaKg = input.nextInt();

        System.out.print("Kaç kilo domates?: ");
        domatesKg = input.nextInt();

        System.out.print("Kaç kilo muz?: ");
        muzKg = input.nextInt();

        System.out.print("Kaç kilo patlıcan?: ");
        patlıcanKg = input.nextInt();

        total = armutKg * ARMUT + elmaKg * ELMA + domatesKg * DOMATES + muzKg * MUZ + patlıcanKg * PATLICAN;

        System.out.println("Toplam tutar: " + total + "TL");
        input.close();

    }

}
