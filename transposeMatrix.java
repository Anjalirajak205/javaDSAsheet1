// question 36/50..
// 20 june 2025

import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i<rows ; i++) {
            for (int j = 0; j<columns;j++){
                matrix[i][j] = sc.nextInt();
                }
                }
                int[][] transpose = new int[columns][rows];
                for (int i = 0; i<rows;i++){
                    for (int j = 0; j<columns;j++){
                        transpose[j][i] = matrix[i][j];
                    }
                }
                System.out.println("The transpose of the matrix is:");
                for (int i = 0; i<columns;i++){
                    for (int j = 0; j<rows;j++){
                        System.out.print(transpose[i][j] + " ");
                        }
                        System.out.println();
                        }
                        }
                        }

                    
                
               
    

