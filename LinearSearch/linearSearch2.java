
import java.util.Scanner;
public class linearSearch2{
    static void find(int arr[],int idx,int num){
        if(idx>=arr.length)return;
       
        if(arr[idx]==num)System.out.print(idx+", ");
        find(arr,idx+1,num);
    }
      public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int arr []={1,2,3,4,5,6,7,5,4,3,3,3};
         
         int idx=0;
         int num=sc.nextInt();
        find(arr,idx,num);
         sc.close();
   }
}
