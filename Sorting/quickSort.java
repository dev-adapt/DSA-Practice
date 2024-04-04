//package java_DSA_practise;

public class quickSort {
    static void printingArr(int arr[]){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition(int arr[],int st ,int end){
        int pivot=arr[st];
        int cnt=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivot)cnt++;
        }
        int pivotIdx=st+cnt;
        swap(arr,st,pivotIdx);
        int i=st,j=end;
        while(i<pivotIdx&&j>pivotIdx){
            while(arr[i]<=pivot)i++;
            while(arr[j]>pivot)j--;
            if(i<pivotIdx&&j>pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quickSorting(int arr[],int st,int end){
        if(st>=end)return;
        int pi=partition(arr,st,end);
        quickSorting(arr, st, pi-1);
        quickSorting(arr, pi+1, end);
    }
    public static void main(String[]args){
        int arr[]={4,1,3,5,2};
        int n=arr.length;
        System.out.println("Array before sorting");
        printingArr(arr);
        quickSorting(arr, 0, n-1);
        System.out.println();
        System.out.println("Array after sorting");
        printingArr(arr);
    }
}
