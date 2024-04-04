
import java.util.Scanner;
public class linearSearch{
    // static boolean linearsearch(int[]arr,int idx,int num){
    //     if(idx>=arr.length)return false ;
    //      if(arr[idx]==num) return true ;      
    //      return  linearsearch(arr, idx+1,num);   
        //  if(linearsearch(arr,idx+1,num)){
        //     return true;
        //  } else{
        //     return false;
        //  }
        static int linearsearch(int[]arr,int idx,int num){
        if(idx>=arr.length)return -1 ;
         if(arr[idx]==num) return idx ;      
         return  linearsearch(arr, idx+1,num);  
    }
      public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
       
         int arr []={1,2,3,4,5,6,7,5,4,3,33};
         
         int idx=0;
         int num=sc.nextInt();
         System.out.println(linearsearch(arr,idx,num));
    //    if(linearsearch(arr,idx,num)){
    //     System.out.println("Yes");
    //    } else{
    //     System.out.println("No");
    //    }
         sc.close();
   }
}