// 9/50 question
public class Sorted_Rotated {
    

    static boolean isSortedAndRotated(int[] arr) {
        int n = arr.length;

        // Find the index where the order breaks
        int i;
        for (i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                break;
            }
        }

        // If array is fully sorted (no rotation)
        if (i == n - 1) {
            return false;
        }

        // Check if the rest of the array is sorted
        for (int j = i + 1; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                return false;
            }
        }

        
        return arr[n - 1] <= arr[0];
    }

    public static void main(String[] args) {
        int[] arr = {5,7,8,9,3};

        if (isSortedAndRotated(arr)) {
            System.out.println(" Array is sorted and rotated.");
        } else {
            System.out.println(" Array is not sorted and rotated.");
        }
    }
}

    

   

    