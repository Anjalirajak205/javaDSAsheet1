// quest 11/50...
// 29 may 2025
public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {20, 10, 60, 20, 10, 5, 3, 3, 6, 5, 40, 20};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int j;
            // Check if arr[i] has appeared before
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }

            // If j == i, arr[i] is unique up to this point
            if (j == i) {
                int count = 1;
                for (int k = i + 1; k < n; k++) {
                    if (arr[i] == arr[k]) {
                        count++;
                    }
                }
                System.out.println("Number: " + arr[i]  + "   occurs: " + count + " times");
            }
        }
    }
}

        
                    
                    
            
        

        


    

