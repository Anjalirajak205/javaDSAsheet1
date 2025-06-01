public class SubarrayGivenSum{
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 7, 5};
            int k = 15; // Required sum

            int sum = 0, a = 0;

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i]; // Add element

                while (sum > k) {
                    sum -= arr[a]; // Remove from start
                    a++;
                }

                if (sum == k) {
                    System.out.print("Subarray with sum " + k + " is: ");
                    for (int j = a; j <= i; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    return;
                }
            }

            System.out.println("Subarray with given sum not found.");
        } catch (Exception e) {
            System.out.println("Error occurred while finding subarray.");
        }
    }
}


   
    
        
        
    
    
