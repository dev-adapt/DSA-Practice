package ARRAYS;
import java.util.Scanner;
public class ArrayMultiplying{
static void multi(int arr1[][], int arr2[][], int r1, int c1,int r2, int c2) {
    if(r1!=c2){
        System.out.println("wrong inputs");
        return;
    }
    int a[][] = new int[r1][c2];
    for (int i = 0; i <r1; i++) {
        for(int j = 0; j<c2; j++){ 
            for(int k=0;k<c1;k++){
               a[i][j] += arr1[i][k] * arr2[k][j];
            }
        }
    }
    System.out.println("The array is:");
    for (int i = 0; i <r1; i++) {
        for (int j = 0; j <c2; j++) {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println(); 
}


public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row value in n for array1");
    int r1 = sc.nextInt();
    System.out.println("Enter the column value in m for array1");
    int c1 = sc.nextInt();
    int arr1[][] = new int[r1][c1];
     for (int i = 0; i <r1; i++) {
        for (int j = 0; j < c1; j++) {
            System.out.print("Enter value at index " + i + j + ": ");
            arr1[i][j] = sc.nextInt();
        }
    }
    System.out.println("Enter the row value in x for array2");
    int r2 = sc.nextInt();
    System.out.println("Enter the column value in y for array2");
    int c2 = sc.nextInt();
    int arr2[][] = new int[r2][c2];
     for (int i = 0; i < r2; i++) {
        for (int j = 0; j <c2; j++) {
            System.out.print("Enter value at index " + i + j + ": ");
            arr2[i][j] = sc.nextInt();
        }
    }
   
    multi(arr1,arr2,r2,c2,r1,c1);
 sc.close();
}
}

