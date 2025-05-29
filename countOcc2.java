import java.util.ArrayList;
    public class countOcc2 {
          public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // Adding elements to the dynamic array
        arr.add(20);
        arr.add(10);
        arr.add(60);
        arr.add(20);
        arr.add(10);
        arr.add(5);
        arr.add(3);
        arr.add(3);
        arr.add(6);
        arr.add(5);
        arr.add(40);
        arr.add(20);

        int n = arr.size();

        for (int i = 0; i < n; i++) {
            int j;
            // Check if arr.get(i) has appeared before
            for (j = 0; j < i; j++) {
                if (arr.get(i).equals(arr.get(j))) {
                    break;
                }
            }

            // If j == i, arr.get(i) is unique up to this point
            if (j == i) {
                int count = 1;
                for (int k = i + 1; k < n; k++) {
                    if (arr.get(i).equals(arr.get(k))) {
                        count++;
                    }
                }
                System.out.println("Number: " + arr.get(i) + "   occurs: " + count + " times");
            }
        }
    }
}

    

