//package java_DSA_practise;
import java.util.*;
public class anagram {
    static void checkingAnagram(HashMap<Character,Integer>mp,String str2){
       for(int i=0;i<str2.length();i++){
        char ch=str2.charAt(i);
        if( mp.containsKey(ch)==true){
            int value=mp.get(ch)-1;
            mp.put(ch,value);
        }
       }
    }
    public static void main(String args[]){
    HashMap<Character, Integer>mp=new HashMap<>();
    String str="silent";
    String str2="listen";
    if(str.length()!=str2.length()){
        System.out.println("invalid anagrams");
    }else{
        int ascii=97;
    for(int i=1;i<=26;i++){
       char ch=(char)ascii;
       ascii++;
       mp.put(ch,0);
    }
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        int value=mp.get(ch)+1;
        mp.put(ch,value);
        }
        //System.out.println(mp);
        checkingAnagram(mp, str2);
        //System.out.println(mp);
        ascii=97;
        for(int i=1;i<=26;i++){
            char ch=(char)ascii;
            ascii++;
            if(mp.get(ch)==0)mp.remove(ch);
        }
        if(mp.isEmpty())System.out.println("valid anagram");
        else System.out.println("invalid anagram");
    }
    
    }
}
