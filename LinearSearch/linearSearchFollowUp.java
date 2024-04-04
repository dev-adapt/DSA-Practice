
//import java.util.Scanner;
public class linearSearchFollowUp {
    //implement is sorted method
    static int isSorted(int arr[],int idx){
        if(idx>=arr.length) return 1;
        if(arr[idx-1]>=arr[idx]) return 0;
       return isSorted(arr, idx+1);
    }
    public static void main(String args[]){
    // Scanner sc= new Scanner(System.in);
    // int n=sc.nextInt();

    // sc.close();
    int arr[]={1,2,4,5,6,7,2};
    int idx=1;
    if(isSorted(arr,idx)==1){
        System.out.println("YES ARRAY IS SORTED");
    }else{
        System.out.println("NO THE ARRAY IS NOT SORTED");
    }
    }
}
