//  question 6/50
public class UnionInteraction {
 public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6,7};
        int[] arr2 = {2, 3, 5, 7};

        // Union
        System.out.print("Union: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        for (int i = 0; i < arr2.length; i++) {
            int j;
            for (j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    break;
                }
            }
            if (j == arr1.length) {
                System.out.print(arr2[i] + " ");
            }
        }

        System.out.println();

        // Intersection
        System.out.print("Intersection: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }

        System.out.println();
    }
}