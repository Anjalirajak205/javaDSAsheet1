// question 2/50

import java.util.Scanner;

public class reverseArray {

    public static void main(String[] args) {

        
        int[] arr={8,7,6};
        System.out.println("The reversed elements are");
        int temp;
        for (int i=0;i<arr.length;i++){
            for (int j=arr.length-1;j>=0;j--){
                
                if(i<j){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                   System.out.println(arr[i]);
                
                }
            }
          
        }

    }
    
} 
    

