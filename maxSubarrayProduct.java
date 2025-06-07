// question 20/50...
//07/06/2025

public class maxSubarrayProduct {
    

    public static int maxProduct(int[] arr) {
        int maxProduct = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int p = 1;
            for (int j = i; j < arr.length; j++) {
                p = p*arr[j];

                // manually compare maxProduct and product
                if (p > maxProduct) {
                    maxProduct = p;
                }
            }
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,-3,6};
        System.out.println("Maximum product subarray: " + maxProduct(nums));
    }
}

    
