// quest 48/50.
//29 june.

import java.util.Arrays;
public class MeadianRCwiseSoertedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        int[] sorted = new int[row * col];
        int index = 0;
        for (int i = 0; i<row ; i++){
            for (int j = 0; j<col ;j++){
                sorted[index++] = matrix[i][j];
                }
                }
               Arrays.sort(sorted);

        int n = sorted.length;
        int median;

        if (n % 2 == 1) {
            median = sorted[n / 2];  
        } else {
            median = (sorted[(n - 1) / 2] + sorted[n / 2]) / 2; 
        }
        System.out.println("Median is: " + median);
    }
}
            

        
    

