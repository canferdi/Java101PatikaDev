import java.util.Scanner;

public class MaxMinNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberCount, number, maxNum, minNum;

        maxNum = Integer.MIN_VALUE;
        minNum = Integer.MAX_VALUE;

        System.out.print("Kaç tane sayı gireceksiniz?: ");
        numberCount = input.nextInt();

        for (int i = 1; i <= numberCount; i++) {

            System.out.print(i + ". sayıyı giriniz: ");
            number = input.nextInt();

            if (number <= minNum) {
                minNum = number;

            } else if (number >= maxNum) {
                maxNum = number;

            }
        }

        System.out.println("En büyük sayı: " + maxNum);
        System.out.println("En küçük sayı: " + minNum);

        input.close();
    }
}
