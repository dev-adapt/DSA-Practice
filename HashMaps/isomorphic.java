//package java_DSA_practise;
import java.util.*;

public class isomorphic {
    static HashMap<Character,Integer>mapingFunctions(String str){
        HashMap<Character, Integer>mp=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }else{
                int value=mp.get(ch);
                mp.put(ch,value+1);
            }
        }
        return mp;
    }
    public static void main(String args[]){
        String s="xxy";
        String t="aab";
        if(s.length()!=t.length()){
            System.out.println("strings are not isomorphic");
        }else{
            Map<Character,Integer>mp1=mapingFunctions(s);
            Map<Character,Integer>mp2=mapingFunctions(t);
            System.out.println(mp1);
            System.out.println(mp2);
            for(var e:mp1.entrySet()){
                for(var f:mp2.entrySet()){
                   // int change=-1;
                    if(e.getValue()!=f.getValue()){
                        
                    }
                }
            }
            if(mp1.isEmpty()==true&&mp2.isEmpty()==true){
                System.out.println("strings are isomorphic");
            }else System.out.println("strings are not isomorphic");
        }
  
    }
}
