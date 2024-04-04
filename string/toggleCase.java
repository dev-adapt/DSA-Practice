package Strings;

import java.util.*;

public class toggleCase {
    static void toggle(StringBuilder str){
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int asci=(int)ch;
            if(asci>=65&&asci<=91||asci>=97&&asci<=123){
                boolean flag=true;
                if(asci>=97)flag =false;
                if(flag==true){
                    asci+=32;
                    char dh=(char)asci;
                    str.setCharAt(i, dh);
                }else{
                     asci-=32;
                    char dh=(char)asci;
                    str.setCharAt(i, dh);
                }
            }else{
                continue;
            }
        }
        System.out.println(str);
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    StringBuilder str=new StringBuilder(sc.nextLine());
    System.out.println(str);
    toggle(str);
    sc.close();
    }
}
