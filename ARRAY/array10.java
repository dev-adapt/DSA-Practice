package ARRAYS;
public class array10 {
/*Q1. Given an array arr[] of size n, find the first repeating element. The element should occur more than
once and the index of its first occurrence should be the smallest. If no repeating element exists, print -1. */
    static void occurence(int arr[]){
        int count=0;
        for(int i=0;i<arr.length-1;i++){ 
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                   count ++ ;
                }
            }
            if(count>0){
                System.out.println(arr[i]);
                break;
            }
    }
    if(count>0){
        System.out.println( "  has repeated itself "+ count+ " times");
    }else{
        System.out.print(" -1");
    }
    }
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5,6,7,8,6,4,3,2};
        occurence(arr);
    }
}

