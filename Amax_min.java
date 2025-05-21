// question 1/50
public class Amax_min {
    public static void main(String[] args) {
        int[] arr={60,1,89,5,3,6};
        int max=0;
        int min=arr[0];
        

        for(int i=0;i<arr.length;i++){
           
            if(arr[i]>max){
            max=arr[i];
            }

            if(min>arr[i]){
                min=arr[i];
            }
            
        }
        System.out.println("maximum element is "+max);
        
        System.out.println("minimum element is "+min);
    }
} 
    

