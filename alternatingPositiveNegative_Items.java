public class alternatingPositiveNegative_Items {
    public static void alternateArrange(int arr[]) {
        int i = 0;
        int j = 1;
        int temp[] = new int[arr.length];
        int k = 0;

        while (k < arr.length) {
            if (arr[k] >= 0) {
                temp[i] = arr[k];
                i = i + 2;
            } else {
                temp[j] = arr[k];
                j = j + 2;
            }
            k++;
        }
       for (k = 0; k < arr.length; k++) {
            arr[k] = temp[k];
        }
     }
     public static void main(String[] args) {
        int arr[] = {10, -9, 4, 3, -7, -8, 2, 6, -5};
        alternateArrange(arr); // rearranges the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
        
    



        
    
    
      



        
    

