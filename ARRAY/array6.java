package ARRAYS;
public class array6{
    static void reversingWithoutTemp(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>=arr.length/2;j--){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        printingArray(arr);
    }
    static void printingArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return;
     }
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println("the original array is this:");
        printingArray(arr);
        System.out.println("we are reversing the array without creating a new array by using temp");
        reversingWithoutTemp(arr);
    }
}
