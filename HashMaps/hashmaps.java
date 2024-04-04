//package java_DSA_practise;
import java.util.*;
public class hashmaps {
    public static void main(String args[]){
        //int n=6;
        int arr[]={1,3,2,1,4,1,4,4,4,4,2,2,2,2,2,2,2,2};
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
           if(!mp.containsKey(arr[i])){
            mp.put(arr[i], 1);
           }else{
            int value=mp.get(arr[i])+1;
            mp.put(arr[i],value);
           }
        }
         for(var e :mp.keySet()){
            System.out.printf("the key %d and its corresponding value is %d\n",e,mp.get(e));
         }
         int max=Integer.MIN_VALUE,ans=0;
         for(var e:mp.keySet()){
            if(mp.get(e)>max){
                max=mp.get(e);
                ans=e;
            }
         }
         System.out.println(ans);
    }
}
