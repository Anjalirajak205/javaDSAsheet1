// question 5/50

import java.util.Arrays;

public class NegativePositive {
    public static void main(String[] args) {
        int [] arr ={-4,-1,3,8,0,-9,5,-2};
        int x=0;
        int[] newArr= new int[arr.length];

        // add negative number first
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                newArr[x++]=arr[i];

            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                newArr[x++]=arr[i];
            }
    }
    // add positive number
    for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                newArr[x++]=arr[i];
            }
        }
        // printing arranged array;
        System.out.println("Arranged Array :");
        for (int i=0;i<newArr.length;i++) {
            System.out.println(newArr[i]);
        }
        // printing sorted array;
         Arrays.sort(newArr);
         System.out.println("\nSorted Array :");
        for(int i=0;i<newArr.length;i++){
             System.out.println(newArr[i]);
        }
    }
}
            
