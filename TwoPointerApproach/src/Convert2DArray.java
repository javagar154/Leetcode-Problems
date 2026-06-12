import java.util.Arrays;

public class Convert2DArray {

    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;

        int[][] matrix = new int[m][n];

        if (original.length != m * n) {
            matrix = new int[0][0];
        } else {

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = original[i * n + j];
                }
            }
        }

        // Print the 2D array
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}