package Strings;

import java.util.Scanner;
import java.lang.Math;
public class penalty {
    static int bestClosingTime(String customers) {
        int n=customers.length();
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){//YYNY
            int penalty=0;
            //when the shop is closed
                for(int j=i;j<n;j++){
                   // System.out.println(j);
                if(customers.charAt(j)=='Y')penalty++;
                }
            //when the shop is open
                 for(int j=0;j<i;j++){
                   // System.out.println(j+"open");
                     if(customers.charAt(j)=='N')penalty++;
                 } 
                 arr[i]=penalty;   
        }
        int min=arr[0],ans=0;
        for(int i=0;i<arr.length;i++){
           
            if(arr[i]<min&&arr[i]!=min){
                min=arr[i];
                ans=i;
            }
        }
        return ans;
    }
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      String customers=sc.next();
      int check=(int)(Math.pow(10,5));
      if(customers.length()<=check&&customers.length()>=1){
        System.out.println(bestClosingTime(customers));
      }
       sc.close();
     }
}
