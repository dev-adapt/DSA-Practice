//package java_DSA_practise;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        }
        public static class linkedlist{
            Node head=null;
            Node tail=null;
            int size=0;
            void insertAtTail(int val){
                Node temp=new Node(val);
                if(head==null){
                    head=temp;
                }else{
                   tail.next=temp;
                } 
                tail=temp; 
                size++;  
            }
            void insertAtHead(int val){
                Node temp=new Node(val);
                if(head==null){
                    head=tail=temp;
                }else{
                    temp.next=head;
                    head=temp;
                }
                size++; 
               // System.out.println();
            }
            void insertAtIdx(int idx,int val){
                Node t=new Node(val);
                Node temp=head;
                if(idx==size())insertAtTail(val);
                 else if(idx==0){
                    insertAtHead(val);
                    return;
                 }
                 else if(idx<0||idx>size())  
                  System.out.println("wrong index to input the data");  
                for(int i=1;i<idx;i++){
                    temp=temp.next;
                }
                t.next=temp.next;
                temp.next=t;
                size++; 
            }
            void display(){
                Node temp=head;
                while(temp!=null){
                 System.out.print(temp.data+" ");
                 temp=temp.next;
                }
                System.out.println();
            }
            int size(){
                Node temp=head;
                int count=0;
                while(temp!=null){
                    count++;
                    temp=temp.next;
                }
                return count;
            }
            //for calculating the size in a much more efficient way we can 
            //introduce size in the structure
            int getAt(int idx){
                int ans=0;
                Node temp=head;
                for(int i=0;i<=idx;i++){
                    ans=temp.data;
                    temp=temp.next;
                }
                return ans;
            }
            void deleteAt(int idx){
                if(idx==0){
                    head=head.next;
                    size--;
                    return;
                }
                Node temp=head;
                for(int i=1;i<idx;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                if(idx==size-1)tail=temp;

                size--;
            }
        }
    public static void main(String args[]){
      linkedlist ll=new linkedlist();
      ll.insertAtTail(4);
      ll.insertAtTail(5);  
     // ll.display();
      ll.insertAtTail(10);
      ll.insertAtTail(34);
     // ll.display();
      ll.insertAtHead(2);
      ll.insertAtHead(1);
     // ll.display();
      ll.insertAtIdx(2, 200);
      ll.display();
     // System.out.println(ll.getAt(3));
     // System.out.println( ll.size );
     ll.deleteAt(6);
     ll.display();
     System.out.println(ll.head.data+" "+ll.tail.data+"size of ll "+ll.size);
    }
}
