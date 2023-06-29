import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Sayıyı giriniz: ");
        number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " palindromdur.");

        } else {
            System.out.println(number + " palindrom değildir.");
        }
    input.close();
    }

    static boolean isPalindrome(int number) {
        int temp = number, lastNumber, reverseNumber = 0;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (reverseNumber == number) {
            return true;

        } else {
            return false;
        }

    }

}
