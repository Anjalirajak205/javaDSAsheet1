import java.util.ArrayList;
import java.util.Scanner;

public class missingNumber{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers (from 1 to " + (n + 1) + "):");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        
        int total = (n + 1) * (n + 2) / 2;

        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        
        int missing = total - sum;
        System.out.println("Missing number is: " + missing);
    }
}
