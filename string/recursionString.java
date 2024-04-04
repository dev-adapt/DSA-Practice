package Strings;

public class recursionString {
    //reverse the string using recursion
    static String reversal(String s,int idx){
        if(idx>=s.length())return " ";
        String smallAns= reversal(s, idx+1);
        char curr=s.charAt(idx);
        return smallAns+curr;
    }
    public static void main(String args[]){
        String s="shruti agnihotri";
        int idx=0;
       System.out.println(reversal(s,idx)); 
   }
}
