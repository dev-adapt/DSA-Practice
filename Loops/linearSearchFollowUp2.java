
public class linearSearchFollowUp2 {
    //find the last index of target in array
    static int lastIndex(int []arr,int target,int idx){
       if(idx<= -1)return -1;
       if(arr[idx]==target)return idx;
       return lastIndex(arr, target, idx-1);
    }
    public static void main(String args[]){
        int arr[]={1,3,4,5,6,4,4,5,2,4};
        int target=4,idx=arr.length-1;
        System.out.println(lastIndex(arr,target,idx));
        }
}
