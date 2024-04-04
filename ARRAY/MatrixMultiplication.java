package ARRAYS;
import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the first matrix
        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int columns1 = scanner.nextInt();

        // Input the dimensions of the second matrix
        System.out.print("Enter the number of rows for the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int columns2 = scanner.nextInt();

        // Validate if matrix multiplication is possible
        if (columns1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
        }else{
        
        // Create the first matrix
        int[][] matrix1 = new int[rows1][columns1];

        // Input the elements of the first matrix
System.out.println("Enter the elements of the first matrix:");
        for(int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Create the second matrix
        int[][] matrix2 = new int[rows2][columns2];

        // Input the elements of the second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        // Perform matrix multiplication and store the result in a new matrix
        int[][] result = new int[rows1][columns2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print the resulting matrix
        System.out.println("The resulting matrix after multiplication is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
        scanner.close();
    }
}
