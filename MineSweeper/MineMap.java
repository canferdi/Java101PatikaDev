package MineSweeper;

import java.util.Random;

public class MineMap {
    Random random = new Random();
    int row, col, randomX, randomY, mineNum = 0;
    int[][] mineMap;
    String[][] map;

    public MineMap(int row, int col) {
        this.row = row;
        this.col = col;
        this.mineMap = new int[row][col];
        this.map = new String[row][col];

        for (String[] strings : map) { // Boş haritaya alt çizgi ekler
            for (int i = 0; i < col; i++) {
                strings[i] = "_";
            }

        }
    }

    public void addRandomMine(int row, int col) { // Haritaya rastgele mayın ekler
        while (mineNum < (row * col / 4)) {
            randomX = random.nextInt(row);
            randomY = random.nextInt(col);

            if (isEmpty(randomX, randomY)) {
                mineMap[randomX][randomY] = 1;
                mineNum++;
            }
        }
    }

    public void mineControl(int selectedRow, int selectedCol) {
        int mineCounter = 0;

        for (int i = selectedRow - 1; i <= selectedRow + 1; i++) { // Mayın kontrolü için satırları hareket ettirir
            for (int j = selectedCol - 1; j <= selectedCol + 1; j++) { // Mayın kontrolü için sütunları hareket ettirir
                if (i >= 0 && i < row && j >= 0 && j < col) {
                    if (!isEmpty(i, j)) {
                        mineCounter++;

                    }
                }
            }
        }

        map[selectedRow][selectedCol] = Integer.toString(mineCounter);
    }

    public void printMap() { // Haritayı yazdırır
        for (String[] is : map) {
            for (String i : is) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public boolean isChecked(int row, int col) {
        if (map[row][col] == "_") {
            return false;
        } else {
            return true;
        }

    }

    public boolean isExplode(int row, int col) {
        if (isEmpty(row, col)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isEmpty(int row, int col) { // Seçilen karenin doluluk durumunu gösterir
        if (mineMap[row][col] == 0) {
            return true;
        } else {
            return false;
        }
    }

}
