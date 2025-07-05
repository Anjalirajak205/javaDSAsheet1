// quest 43/50.
// 24 june 2025

import java.util.Scanner;
public class SnakePattern {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter matrix size: ");
    int n = sc.nextInt();
    printSnakePattern(n);
}
public static void printSnakePattern(int n) {
    int num = 1;
    for (int i = 0; i < n; i++) {
        if (i % 2 == 0) {
            for (int j = 0; j < n; j++) {
                System.out.print(num++ + "\t");
            }
        } else {
            int m = num + n - 1;
            for (int j = 0; j < n; j++) {
                System.out.print(m-- + "\t");
                num++;
            }
        }
        System.out.println();
    }
    }
}