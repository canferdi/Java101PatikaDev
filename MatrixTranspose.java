public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = { { 2, 5 },
                { 3, 6 },
                { 4, 4 } };
        int row = matrix.length;
        int col = matrix[0].length;

        System.out.println("Matris : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }

        System.out.println("\nTranspozu : ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrix[j][i] + "    ");
            }
            System.out.println();
        }

    }
}
