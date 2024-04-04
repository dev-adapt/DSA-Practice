package ARRAYS;

import java.util.Scanner;

import java.util.Arrays;
public class closest3sum {
    static int threeSumClosest(int[] nums, int target) {
         Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize closest sum with the sum of the first three elements

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum; // Update closest sum if the current sum is closer to the target
                }

                if (sum < target) {
                    j++; // Increment j to increase the sum
                } else {
                    k--; // Decrement k to decrease the sum
                }
            }
        }

        return closestSum;
    }
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=3 && n<=500){
            int nums[]=new int[n];
            for(int i=0;i<n;i++){
                int input=sc.nextInt();
                if(input>=-1000 && input<=1000){
                    nums[i]=input;
                }
            }
            int target=sc.nextInt();
            int lim=(int)(Math.pow(10,4));
            if(target>=-lim && target<=lim){

            }
        }
        sc.close();
     }
}
