import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, area, u;

        System.out.print("1. Kenarı giriniz: ");
        a = input.nextDouble();

        System.out.print("2. Kenarı giriniz: ");
        b = input.nextDouble();

        System.out.print("3. Kenarı giriniz: ");
        c = input.nextDouble();

        u = (a + b + c) / 2;

        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Alan: " + area);
        input.close();
    }
}
