//package java_DSA_practise;

public class sortingProblem2 {
    static void printingArr(int arr[]){
        for(int val:arr) System.out.print(val+" ");
    }
    static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void sortArr(int[] num){
        int n = num.length;
        int x = -1, y = -1;
        if(n <= 1){ // corner case, edge case
            return;
        }
        //process all adjacent elements
        for(int i = 1; i < n; i++){
            if(num[i-1] > num[i]){
                if(x == -1){ // first conflict
                    x = i-1;
                    y = i;
                } else { // 2nd conflict
                    y = i;
                }
            }
        }
        swap(num, x, y);
        // swap x, y in num
        // int temp = num[x];
        // num[x] = num[y];
        // num[y] = temp;
    }

    public static void main(String args[]){
        int arr[]={10,5,6,7,8,9,3};
        printingArr(arr);
        System.out.println();
        sortArr(arr);
        printingArr(arr);
    }
}
