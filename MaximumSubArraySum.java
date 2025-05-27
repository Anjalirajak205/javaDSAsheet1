// 8/50 questions

public class MaximumSubArraySum {
    
    public static void main(String[] args) {
        
        int[] arr = {2,1,4,-3,-1,0};
        int currSum=0;
        int maxSum= arr[0];

        int start =0;
        int end =0;
        int s=0;


        for(int i=0;i<arr.length;i++){
            if(currSum +arr[i]>arr[i]){
                currSum = currSum + arr[i];
                }
                else{
                    currSum = arr[i];
                    start = i;
                    }
                    if(currSum>maxSum){
                        maxSum = currSum;
                        end = i;
                        s = start;
                    }
            }
           
            System.out.println("Mximum subarray sum is:" +maxSum);
            System.out.print("Subarray:");
            for(int i=start;i<=end;i++){
                System.out.print(arr[i]+" ");
            }
            
        }

        }
    

        
        

    

