import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double circ, area, r, pi = 3.14;

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();

        circ = 2 * pi * r;
        area = pi * r * r;

        System.out.println("Dairenin yarıçapı: " + r + "cm");
        System.out.println("Dairenin çevresi: " + circ + "cm");
        System.out.println("Dairenin alanı: " + area + "cm²");

    }
}
