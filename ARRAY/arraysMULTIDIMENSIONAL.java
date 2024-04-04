package ARRAYS;
import java.util.Scanner;

public class arraysMULTIDIMENSIONAL {
    static void addition(int arr1[][], int arr2[][], int n, int m,int x, int y) {
        if(n!=x && m!=y){
            System.out.println("wrong inputs");
        }else{
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
         System.out.println("The array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(); 
    }    
}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row value in n for array1");
        int n = sc.nextInt();
        System.out.println("Enter the column value in m for array1");
        int m = sc.nextInt();
        int arr1[][] = new int[n][m];
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter value at index " + i + j + ": ");
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the row value in x for array2");
        int x = sc.nextInt();
        System.out.println("Enter the column value in y for array2");
        int y = sc.nextInt();
        int arr2[][] = new int[n][m];
         for (int i = 0; i < x; i++) {
            for (int j = 0; j <y; j++) {
                System.out.print("Enter value at index " + i + j + ": ");
                arr2[i][j] = sc.nextInt();
            }
        }
       
        addition(arr1,arr2,x,y,n,m);
        
            
        sc.close();
    }
}
