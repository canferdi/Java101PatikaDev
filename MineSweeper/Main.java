package MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col, selectedRow, selectedCol, controlled = 0;

        System.out.print("Lütfen oyun alanının satır sayını giriniz : ");
        row = input.nextInt();
        System.out.print("Lütfen oyun alanının sütun sayını giriniz : ");
        col = input.nextInt();

        MineMap mineMap = new MineMap(row, col);

        mineMap.addRandomMine(row, col);

        do {
            System.out.print("Lütfen oynanacak satırı giriniz : ");
            selectedRow = input.nextInt();
            System.out.print("Lütfen oynanacak sütunu giriniz : ");
            selectedCol = input.nextInt();

            if (mineMap.isChecked(selectedRow, selectedCol)) {
                System.out.println("Bu hücre kontrol edildi lütfen tekrar deneyiniz!");
                continue;
            } else {
                controlled++;
            }

            if (mineMap.isExplode(selectedRow, selectedCol)) {
                System.out.println("Mayın patladı!!!");
            } else {
                mineMap.mineControl(selectedRow, selectedCol);
                mineMap.printMap();
            }
            if (controlled == (row * col * 3 / 4)) {
                System.out.println("Oyunu kazandınız tebrikler!!!");
                break;
            }
        } while (!mineMap.isExplode(selectedRow, selectedCol));

    }
}
