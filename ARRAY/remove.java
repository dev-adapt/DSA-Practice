package ARRAYS;
import java.util.Arrays;
import java.util.Scanner;
public class remove {
    


    static int removeElement(int[] nums, int val) {
        int count=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]==val){
               nums[i]=-1;
               
           }else{
               count++;
           }
           Arrays.sort(nums);
       }return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=0 && n<=100){
            int nums[]=new int[n];
            for(int i=0;i<n;i++){
                int input=sc.nextInt();
                if(input>=0 && input<=50){
                    nums[i]=input;
                }
            }
            int val=sc.nextInt();
            if(val>=0 && val<= 100){
                System.out.println(removeElement(nums,val));
                for(int i=n-1;i>=0;i--){
                   if(nums[i]<0){
                       System.out.print("_");
                   }else{
                        System.out.print(nums[i]);
                   }
                }
            }
        }
        sc.close();
    }
}


