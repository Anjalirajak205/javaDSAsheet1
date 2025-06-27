// quest 46/50.
// 27 june 

public class Search2Dmatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,6,7},{10,12,14,16},{20,22,24,26}};
        int target = 20;
        int result = searchMatrix(matrix, target);
       // System.out.println("Element is present at index: " + result);


     if (result != -1) {
            int c = matrix[0].length;
            int r = result / c;
            int col= result % c;
            System.out.println("Element is present at index: [" + r + "][" + col + "]");
        } else {
            System.out.println("Element not found in the matrix.");
        }
    }

    public static int searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = rows * cols - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midElement = matrix[mid / cols][mid % cols];

            if (midElement == target) {
                return mid; // Return the 1D index
            } else if (midElement < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Not found
    }
}

