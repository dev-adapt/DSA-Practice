package ARRAYS;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class array4 {
    /*Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find
union between these two arrays and print the number of elements of the union set.
Union of the two arrays can be defined as the set containing distinct elements from both
the arrays. If there are repetitions, then only one occurrence of element should be printed
in the union. */

static void unionArrays(int arr_1,int arr_2){
    HashSet<Integer> set = new HashSet<>();
      
    //add first array to set
    set.addAll(Arrays.asList(arr_1));
    
    //add second array to set
    set.addAll(Arrays.asList(arr_2));
    
    //convert to array from set
    Integer[] union = {};
    union = set.toArray(union);
    
    //print the result
    System.out.println("Union of two arrays is: " + Arrays.toString(union));
}
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array in n");
        int n=sc.nextInt();
        System.out.println("the entered array with " +n+" size is ");
        int arr_1[]=new int[n];
        for(int i=0;i<n;i++){
            arr_1[i]=sc.nextInt();
        }
        System.out.println("enter the length of array in m (where m>=n)");
        int m=sc.nextInt();
        System.out.println("the entered array with siz"+m+" is ");
        int arr_2[]=new int[m];
        for(int i=0;i<m;i++){
            arr_2[i]=sc.nextInt();
        }
        sc.close();
    }
}
