import java.util.Arrays;
import java.util.Scanner;

public class SortingArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;

        System.out.print("Dizinin boyutunu giriniz : ");
        size = input.nextInt();
        int[] list = new int[size];

        System.out.println("Dizinin elemanlarını giriniz : "); // ? Eleman girişi
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1 + ". Elemanı : ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);

        System.out.print("Sıralama : ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        input.close();
    }
}
