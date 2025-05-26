// question 4/50
public class Sort0s1s2s {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }
        public static void sort(int[] arr) {
            int low = 0, mid = 0,  high = arr.length - 1;

            if(arr.length ==0) return ;

            do{
                if (arr[mid] == 0) {
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    }
                    else if (arr[mid] == 1) {
                        mid++;
                        }
                        else {
                            swap(arr, mid, high);
                            high--;
                            }
                            }
                            while(mid<=high);
                        }
                            public static void main(String[] args) {
                                int[] arr = {1,0,2,2,1,1,0,0};
                                sort(arr);
                                System.out.println("the sorted array is:");
                                for (int i = 0; i<arr.length;i++){
                                    System.out.print(arr[i]+" ");
                                    }
                              }
                            }
                                           
    