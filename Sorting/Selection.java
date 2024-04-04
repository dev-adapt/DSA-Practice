//package java_DSA_practise;
import java.util.Scanner;
public class Selection {
    static void selectionSort(int arr[]){
        int n=arr.length;
        for (int index = 0; index <n-1; index++) {
            int curr=index;
            for(int i=index+1;i<n;i++){
               if(arr[i]<arr[curr])curr=i;
            }
            int temp=arr[index];
            arr[index]=arr[curr];
            arr[curr]=temp;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr);
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        sc.close();
    }
}
