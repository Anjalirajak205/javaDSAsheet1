import java.util.Arrays;
public class mergeArrays {
    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        for (int i = 0; i < n; i++) {
            
            if (arr1[i] > arr2[0]) {
                // Swap
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                int first = arr2[0];
                int k;
                for (k = 1; k < m && arr2[k] < first; k++) {
                    arr2[k - 1] = arr2[k];
                }
                arr2[k - 1] = first;
            }
        }
    }
   public static void main(String[] args) {
        int[] arr1 = {1,3,8,20,35};
        int[] arr2 = {2, 3, 9};

        merge(arr1, arr2);

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }
}








