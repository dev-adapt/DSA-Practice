package ARRAYS;
//import java.util.Scanner;

     //find the total number of pairs in arrays whose sum is equal to the entered x
   /* static int makingSum(int[]arr,int x){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String []args) {
       
        int []arr={1,2,3,4,5,6,1,2,3,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number whose sum you want to search in the array");
        int x=sc.nextInt();
        System.out.println("the number of pairs existing in array which give the sum as "+x+"are:"+makingSum(arr, x));
        sc.close();
    } */
/*public class array7 {
    static int makingSum(int arr[],int x){
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        int []arr={1,2,3,4,5,6,1,2,3,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number whose sum you want to search in the array");
        int x=sc.nextInt();
        System.out.println("the number of pairs existing in array which give the sum as "+x+"are:"+makingSum(arr, x));
        sc.close();
    }
} */
/* //find the unique number in the array where all the other elements are repeated twice with one being unique
 static void manipulationArray(int arr[]){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                arr[i]=-1;
                arr[j]=-1;
            }
        }
    }
 }
 static int uniqueElement(int arr[]){
    int n=arr.length;
    int ans=0;
    for(int i=0;i<n;i++){
        if(arr[i]>0){
            ans=arr[i];
        }
    }
    return ans;
 }
 public static void main(String args[]) {
    int[]arr={1,2,1,2,3,4,5,3};
    manipulationArray(arr);
    System.out.println("the unique element present in the array is"+uniqueElement(arr));
 } */

 /*    // find the second largest element in the array
    static void largestElement(int arr[]){
        int larg=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>larg){
                larg=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==larg){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        return;
    }
    static int secondLargest(int arr[]){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        int arr[] = { 1, 3, 56, 77, 65, 32, 11, 90, 76, 43 };
        largestElement(arr);
        System.out.println("the second largest element in the array is:" + secondLargest(arr));
    } */
/*//return the first value that is repeating itself in the array if non then return -1
static int repeatingArray(int[]arr){
    int ans=-1;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                return arr[i];  
            }
        }
    }
    return ans;
}
   public static void main(String arg[]) {
     int arr[]={1,2,3,4,5,6,9,4,7,6,1};
     System.out.println("the first element that repeats itself in the array is:"+ repeatingArray(arr));
   } */

   /*  static boolean pairExists(int arr[],int x){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]-arr[j]==x||arr[i]-arr[j]==-x){
                    ans++;
                }
            }
        }
        System.out.println("the number of such pairs :"+ans);
        if(ans>0){
            return true;
        }else{
            return false;
        }
    }
//- Given an array sorted in increasing order of size n and an integer x, find if there exists a
//pair in the array whose absolute difference is exactly x.(n>1)
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the integer whose difference you want to see");
        int x=sc.nextInt();
        sc.close();
        System.out.println("the result for existance of pair with absolute difference of "+x+" is:"+pairExists(arr, x));

    }
} */
/*import java.util.Scanner;
public class array6 {
    static void enteringValue(int arr[],int k){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<k;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
    }
    static void missingElement(int arr[],int k,int n){
        int array[]=new int[n];
        for(int s=0;s<array.length;s++){
            array[s]=s+1;
        }
        for(int i=0;i<k;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==array[j]){
                    array[j]=-1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(array[i]>0){
                System.out.print(array[i]);
            }
        }
        return ;
    }
    //- Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
   // missing number from the first N integers. There are no duplicates in the list.
   public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n where n is some natural number");
    int n=sc.nextInt();
    int k=n-1;
    int arr[]=new int[k];
    System.out.println("enter the values in the array of size"+k+"such that no values repeat and they are in between from 1 to"+k);
    enteringValue(arr,k);
    System.out.println("the missing number from the array are");
    missingElement(arr,k,n);
    sc.close();
   }
} */

/*public class array6{
     static void printingArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return;
     }
     static void reversingArray(int[]arr,int[]array){
       
        int k=arr.length;
        for(int i=k-1;i>=0;){                   can do this with while loop too it would look more clean
            for(int j=0;j<k;){                   int i=k-1, int j=0;
                array[j++]=arr[i--];             while(i>=0){
                                                    array[j++]=arr[i--];  
                }                                } 
            }
        }
        return;
     }
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5,6};
        System.out.println("the original array is");
        printingArray(arr);
        System.out.println("now we have to print the reversed array");
        int array[]=new int[arr.length];
        reversingArray(arr,array);
        printingArray(array);

    }
 */