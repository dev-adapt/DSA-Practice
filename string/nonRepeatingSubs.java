package Strings;
//import java.util.*;
public class nonRepeatingSubs {
    static boolean unique(String check){
        int n=check.length();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(check.charAt(i)==check.charAt(j))return false;
            }
        }  
        return true;      
    }
    public static void main(String args[]){
        String str="pwwkew";
        String check="";
        int count=0,ans=0;
        int n=str.length();
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                check=str.substring(i, j);
                if(unique(check)){
                    count=check.length();
                    if(count>ans)ans=count;
                }
            }
        }
        System.out.println(ans);
    }
}
