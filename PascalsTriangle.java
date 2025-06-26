// quest 45/50 .
// 26 june 

import java.util.ArrayList;
import java.util.Scanner;

public class PascalsTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> triangle = PascalTriangle(n);

        // Print the triangle
        for (ArrayList<Integer> row : triangle) {
            int s = n - row.size();
            for (int i = 0; i < s; i++) {
                System.out.print(" ");
            }
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> PascalTriangle(int numRows) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1); // First element is always 1

            for (int j = 1; j < i; j++) {
                row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }

            if (i > 0) {
                row.add(1); // Last element is always 1
            }

            triangle.add(row);
        }

        return triangle;
    }
}





    

