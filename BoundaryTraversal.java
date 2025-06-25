// quest 44/50 ..
// 25 june..
public class BoundaryTraversal {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
            };
            int row = matrix.length;
            int col = matrix[0].length;
            int top = 0;
            int bottom = row - 1;
            int left = 0;
            int right = col - 1;
             if (row == 1) {
        
            for (int i = 0; i < col; i++)
                System.out.print(matrix[0][i] + " ");
        } else if (col == 1) {
            
            for (int i = 0; i < row; i++)
                System.out.print(matrix[i][0] + " ");
        } else {
            for (int i = left; i <= right; i++)
                System.out.print(matrix[top][i] + " ");

            for (int i = top + 1; i <= bottom; i++)
                System.out.print(matrix[i][right] + " ");

            for (int i = right - 1; i >= left; i--)
                System.out.print(matrix[bottom][i] + " ");

            for (int i = bottom - 1; i > top; i--)
                System.out.print(matrix[i][left] + " ");
        }
    }
}

    

