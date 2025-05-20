public class NegativePositive {
    public static void main(String[] args) {
        int [] arr ={-1,-5,4,0,-6};
        int index=0;
        int[] newArr= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                newArr[index++]=arr[i];

            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                newArr[index++]=arr[i];
            }
    }
    for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                newArr[index++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}
            
