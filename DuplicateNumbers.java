// quest 16/50
// 03/06/2025
import java.util.HashSet;

public class DuplicateNumbers {
    static void duplicate(int[] arr) {
        System.out.println("Duplicate elements are:");
        HashSet<Integer> s = new HashSet<>();
        
        for (int num : arr) {
            if (s.contains(num)) {
                System.out.println(num);
            } else {
                s.add(num);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 3, 8, 5, 3, 9, 8};
        System.out.println("Array:");
        for (int num : arr) {
            System.out.println(num);
        }
        duplicate(arr);
    }
}





