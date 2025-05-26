// 10/50 questions
public class Leader_array {
    public static void main(String[] args) {
        int[] arr = {4,76,8,3,2,4};
        int n = arr.length;
        int max = arr[n-1];
        int i = n-2;

        System.out.println("leaders in array are : " + max );
        while(i>=0){
            if(arr[i]>max){
               max = arr[i];
               System.out.println(max);
               }
               i--;
            }
        }


    
}
