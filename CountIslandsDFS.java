// quest 47/50.
// 28 june .


import java.util.Scanner;

public class CountIslandsDFS {
    
   public static void dfs(char[][] matrix, int i, int j) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[i][j] != '1') {
            return;
        }

        matrix[i][j] = '0';
        dfs(matrix, i + 1, j); // down
        dfs(matrix, i - 1, j); // up
        dfs(matrix, i, j + 1); // right
        dfs(matrix, i, j - 1); // left
    }
     public static int countIslands(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int islandCount = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    dfs(matrix, i, j);
                    islandCount++;
                }
            }
        }

        return islandCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        
        char[][] matrix = new char[rows][cols];

        System.out.println("Enter the matrix values row by row (only 1 or 0):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.next().charAt(0);  
            }
        }

        int result = countIslands(matrix);
        System.out.println("Number of islands: " + result);

        sc.close();
    }
}


    

