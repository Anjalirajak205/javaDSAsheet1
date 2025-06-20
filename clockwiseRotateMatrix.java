// question 37/50..
// 20 june .

public class clockwiseRotateMatrix {
    public static void rotateMatrix(int[][] original) {
        int n = original.length;
        int[][] rotated = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                rotated[col][n - 1 - row] = original[row][col];
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                original[row][col] = rotated[row][col];
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3},{4, 5, 6}, {7, 8, 9}};

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotateMatrix(matrix);

        System.out.println("\nRotated Matrix (90° Clockwise):");
        printMatrix(matrix);
    }
}

