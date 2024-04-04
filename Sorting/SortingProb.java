//package java_DSA_practise;

public class SortingProb {
    static void zeros(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]==0&&arr[i+1]!=0){
               for(int j=i;j<n-1;j++){
                 arr[j]=arr[j+1];
                arr[j+1]=0;
               }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={0,1,2,4,0,7,0,9,6};
        zeros(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
