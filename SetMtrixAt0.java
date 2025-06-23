// ques 41/50.
// 23 june 

public class SetMtrixAt0 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3},{4, 0, 6},{7, 8, 9}};
            int[][] result = setMatrixAt0(matrix);
            printMatrix(result);
            }
           public static int[][] setMatrixAt0(int[][] matrix) {
           int rows = matrix.length;
           int cols = matrix[0].length;
           boolean[] zeroRows = new boolean[rows];
           boolean[] zeroCols = new boolean[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    result[i][j] = 0;
                } else {
                    result[i][j] = matrix[i][j];
                }
            }
        }
        return result;
    }
     public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
} 
    

