// quest 17/50..
//03 june

public class ArrayIntersection {
    public static void Intersection(int [] arr1, int[] arr2) {
        int i = 0, j = 0;
        System.out.println("Intersections of Array:");
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]<arr2[j]){
                j++;
            }else{
                System.out.println(arr1[i]);
                i++;
                j++;
            }

        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = {5,6,7,8,9,10};
        Intersection(arr1, arr2);
    }

    
}
