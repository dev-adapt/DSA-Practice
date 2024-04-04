//package java_DSA_practise;

import java.util.ArrayDeque;
import java.util.Queue;

public class queues {
    public static void main(String args[]){
     Queue<Integer>q=new ArrayDeque<>();
     q.add(1);
     q.add(3);
     q.add(13);
     q.add(4);
     q.add(7);
     q.add(16);
     q.add(10);
     System.out.println("printing the queue by builtin way" );
     System.out.println(q);
    // int n=q.size();
    Queue<Integer>q2=new ArrayDeque<>();
     while(q.size()>0){
        q2.add(q.remove());
     }
     while(q2.size()>0){
        System.out.print(q2.remove()+" ,");
     }
    }
}
