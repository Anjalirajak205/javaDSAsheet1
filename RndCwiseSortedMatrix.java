// question 38/50.
// 21 june .
public class RndCwiseSortedMatrix {
    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = new int[n][n];
        int count = 1;

        //  matrix with increasing numbers
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = count++;

        // Print matrix
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
       // Key to search
        int key = 10;
         int i = 0, j = n - 1;
        boolean found = false;
        while (i < n && j >= 0) {
            if (matrix[i][j] == key) {
                System.out.println("Key " + key + " found at (" + i + "," + j + ")");
                found = true;
                break;
            } else if (matrix[i][j] > key) {
                j--;
            } else {
                i++;
            }
        }

        if (!found)
            System.out.println("Key " + key + " not found");
    }
}
