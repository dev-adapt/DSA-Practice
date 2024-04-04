package ARRAYS;

public class mountainPeak {
    static int peakIndexInMountainArray(int[] arr) {
        int st=0,end=arr.length-1,ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]<arr[mid+1]){
                ans=mid+1;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5,6,5,2,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
