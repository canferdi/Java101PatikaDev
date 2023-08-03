import java.util.Arrays;

public class NearestNumber {
    public static void main(String[] args) {
        int[] liste = { 15, 12, 788, 1, -1, -788, 2, 0 };
        int num, min = liste[0], max = liste[0];

        num = 5;
        for (int i : liste) {
            if ((i <= num) && (Math.abs(num - i) < Math.abs(num - min))) {
                min = i;
            }
            if ((i >= num) && (Math.abs(num - i) < Math.abs(num - max))) {
                max = i;
            }
        }
        System.out.println("Dizi : " + Arrays.toString(liste));
        System.out.println("Girilen Sayı : " + num);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
