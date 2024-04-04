package ARRAYS;
import java.util.Scanner;
public class array8 {
    static void printingArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return;
     }
     static void roatatingArray(int arr[],int x){
        int n= arr.length;
        int array[]=new int[n];
        int j=0;
        for(int i=n-(x%n);i<n;i++){
            array[j++]=arr[i];
       }
       for(int i=0;i<n-(x%n);i++){
        array[j++]=arr[i];
    }
         printingArray(array);
       return;
     }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println("this is the original array");
        printingArray(arr);
        System.out.println();
        System.out.println("enter how many times you want to rotate the array");
        int x=sc.nextInt();
        System.out.println("the array is rotated "+x+" times:");
        roatatingArray(arr, x);
        
        sc.close();
    }
}
