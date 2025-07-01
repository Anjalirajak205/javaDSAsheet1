// quest 50/50.
// 01 june 2025.

public class BooleanMatrixProblem {
    public static void modifyMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRow = false;
        boolean firstCol= false;
        
        // Step 1: Check if first row has 1
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 1) {
                firstRow = true;
                break;
            }
        }

        // Step 2: Check if first column has 1
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 1) {
                firstCol = true;
                break;
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][0] = 1;
                    matrix[0][j] = 1;
                }
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 1 || matrix[0][j] == 1) {
                    matrix[i][j] = 1;
                }
            }
        }
        if (firstRow) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 1;
            }
        }
        if (firstCol) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 1;
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0, 0},
            {0, 1, 0, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 1}
        };
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        modifyMatrix(matrix);
        
        System.out.println("\nModified Matrix:");
        printMatrix(matrix);
    }
}
