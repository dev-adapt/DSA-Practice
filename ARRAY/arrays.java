package ARRAYS;
//Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.
/*  Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of
 strings and print all
strings stored on odd indices of the array.*/
//transvers over elements of array using for each loop for arr {1,2,3,4,5,6,7,8}
//{2,-3,5,8,1,0,-4}

    /* int[] arr={2,6,-5,-1,0,4,-9};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                System.out.println(arr[i]);
            }
        } */
      /*  int[]arr={1,2,3,4,5,6,7,8};
        for(int array:arr){
            if(array%2==0){
                System.out.println(array);
            }
        } */
       /* int[]arr={2,-3,5,8,1,0,-4};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        System.out.println("the minimum value that we can get from this array is "+ ans); */
        public class arrays{
            public static void main(String args[]) {
                int[]arr={1,1,3,4,2,3,5,7,0};
                int ans=0;
                for(int i=1;i<arr.length-1;i++){
                    if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                        ans = arr[i];
                    }
                }
                System.out.println("the peak value from the array is"+ans);
    }
}