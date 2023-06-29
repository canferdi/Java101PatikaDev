import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temp1 = 0, temp2 = 1, sum, num;

        System.out.print("Fibonaccinin eleman sayısı: ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print(temp1 + " ");
            sum = temp1 + temp2;
            temp1 = temp2;
            temp2 = sum;

        }
    input.close();
    }
    

}
