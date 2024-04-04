package ARRAYS;
import java.util.Scanner;
public class array9{
    static int[] makeFrequencyArray(int[]arr){
        int[]freq= new int[100010];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[]freq= makeFrequencyArray(arr);
        System.out.println("enter the number of queries");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("enter the number you want to search in the array");
            int x=sc.nextInt() ;
            if(freq[x]>0){
                System.out.println("yes "+x+ " is present in array");
            }
            else{
                System.out.println("yes "+x+ " is not present in array");
            }
         }
        sc.close();
    }
}
    
