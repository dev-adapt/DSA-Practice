//package java_DSA_practise;
import java.util.*;
import java.util.LinkedList;
public class reorderQueue{
    public static void main(String args[]){
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);
        //original queue= 1 2 3 4 5 6 7 8
        //ans queue=1 5 2 6 3 7 4 8
        //do this with the help of a stack
      //  reordering(q);
       Stack<Integer>s=new Stack<>();
       for(int i=1;i<=(q.size()/2);i++){
        s.push(q.remove());
       }
        while(s.size()>0){
            q.add(s.pop());
        }
       for(int i=1;i<=(q.size()/2);i++) {
            s.push(q.remove());
        }
        for(int i=1;i<=(q.size()/2);i++){
            q.add(s.pop());
            q.add(q.remove());
        }
        while(q.size()>0){
            s.push(q.remove());
        }
        while(s.size()>0){
            q.add(s.pop());
        }
        System.out.println(q);
    }
}