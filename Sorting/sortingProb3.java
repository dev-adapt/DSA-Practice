//package java_DSA_practise;

public class sortingProb3 {
    static void printingArr(int arr[]){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    static void countSort(int[]arr){
        int n=arr.length;
        int[]output=new int[n];
        int[]count=new int[4];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }

    }
    public static void main(String args[]){
        int arr[]={1,1,0,2,2,0,1,0,0};
        countSort(arr);
        printingArr(arr);
    }
}
