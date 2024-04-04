package Strings;
// import java.util.*;
public class palindromeSubstring {
    static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }return true;
    }
      public static void main(String args[]){
        String s="abcdef";
        int n=s.length();
        int count=0;
    for(int i=0;i<=n;i++){
        for(int j=i+1;j<=n;j++){
            if(isPalindrome(s.substring(i, j)))count++;
        }
    }
       System.out.println(count);
    }
}
