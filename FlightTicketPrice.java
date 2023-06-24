import java.util.Scanner;

public class FlightTicketPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distance, totalPrice, PERPRİCE = 0.10;
        int flightType, age;

        System.out.print("Gideceğiniz mesafe(km): ");
        distance = input.nextDouble();

        System.out.print("Yaşınız: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipi(1-Tek yön, 2- Gidiş dönüş): ");
        flightType = input.nextInt();

        totalPrice = distance * PERPRİCE;

        if (distance > 0 && age > 0 && (flightType == 1 || flightType == 2)) {

            if (flightType == 2) { // Gidiş dönüş seçilirse %20 indirim
                totalPrice *= 1.60;
            }

            if (age < 12) { // 12 yaşından küçükse %50 indirim
                totalPrice *= 0.50;

            } else if (age >= 12 && age < 24) { // 12-24 yaş aralığındaysa %10 indirim
                totalPrice *= 0.9;

            } else if (age >= 65) { // 65 yaş üstüyse %30 indirim
                totalPrice = 0.70;

            }

        } else {
            System.out.println("Hatalı veri girdiniz!");

        }

        System.out.println("Ödemeniz gereken tutar: " + totalPrice + "TL");
        input.close();
    }
}
