package Strings;

public class substrings {
    public static void main(String args[]){
    String s="abcdef";
    int n=s.length();
    for(int i=0;i<=n;i++){
        for(int j=i+1;j<=n;j++){
            System.out.print(s.substring(i,j)+" ,");
        }
    }
    }
}
