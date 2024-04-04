package ARRAYS;
import java.util.Arrays;

import java.util.Scanner;
import java.lang.Math;
public class Majority {
    static int majorityElement(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;
     return n/2;
    }
    static int[] sorting(int []nums){
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int limit=(int)(Math.pow(10,9));
        if(n>=1 && n<=50000){
            int nums[]=new int[n];
            for(int i=0;i<n;i++){
                int input=sc.nextInt();
                if(input>= -limit && input<= limit){
                    nums[i]=input;
                }
            }
            int ans=majorityElement(nums);
            System.out.println(ans);
             sorting(nums);
             for(int i=0;i<nums.length;i++){
                System.out.print((nums[i]));
             
             }

        }
        sc.close();
    }
}

