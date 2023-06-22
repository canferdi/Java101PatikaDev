import java.util.Scanner;

public class KdvCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price, kdvPrice;
       
        System.out.print("Please enter the price: ");
        price = input.nextDouble();

        double KDV = (price <= 1000 && price >= 0) ? 0.18 : 0.08;
        kdvPrice = price * KDV + price;
        
        System.out.println("Price: " + price);
        System.out.println("KDV: " + KDV);
        System.out.println("Price with KDV: " + kdvPrice);
    }
}
