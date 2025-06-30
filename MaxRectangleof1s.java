// quest 49/50.
//30 june 2025
import java.util.Arrays;
public class MaxRectangleof1s {
public static int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[] height = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(right, n); 
        int maxArea = 0;
        
        for (int i = 0; i < m; i++) {
            int curLeft = 0, curRight = n;

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1')
                    height[j]++;
                else
                    height[j] = 0;
            }

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1')
                    left[j] = Math.max(left[j], curLeft);
                else {
                    left[j] = 0;
                    curLeft = j + 1;
                }
            }

            for (int j = n - 1; j >= 0; j--) {
                if (matrix[i][j] == '1')
                    right[j] = Math.min(right[j], curRight);
                else {
                    right[j] = n;
                    curRight = j;
                }
            }

            for (int j = 0; j < n; j++) {
                int width = right[j] - left[j];
                int area = height[j] * width;
                maxArea = Math.max(maxArea, area);
            }
        }
         return maxArea;
    }
    public static void main(String[] args) {
        char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        int maxArea = maximalRectangle(matrix);
        System.out.println("Maximum rectangle area of 1s: " + maxArea);
    }
}
