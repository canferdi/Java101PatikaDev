import java.util.Scanner;

public class Taksimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int km;
        double total, perKm = 2.20, startPrice = 10;

        System.out.print("Gidilecek kilometreyi giriniz: ");
        km = input.nextInt();

        total = startPrice + perKm * km;

        total = (total < 20) ? 20 : total;

        System.out.println("Ödenecek ücret: " + total + "₺");
    }
}
