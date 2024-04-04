//package java_DSA_practise;

public class treeBasic {
   public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    } 
    static int sum(Node root){
        if(root==null)return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    static void display(Node root){
        if(root==null)return;
        else{
            System.out.print(root.val+"->");
            if(root.left!=null)System.out.print(root.left.val+" ");
            else System.out.print("null  ");
            if(root.right!=null)System.out.print(root.right.val+" ");
             else System.out.print("null  ");
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }
    static int size(Node root){
        if(root==null)return 0;
        return 1+size(root.left)+size(root.right);
    }
    static int maximum(Node root){
        if(root==null)return Integer.MIN_VALUE;
        int sum= Math.max(maximum(root.left),maximum(root.right));
        return Math.max(root.val, sum);
    }
    // height of the tree is number of levels minus 1 generally
    static int height(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null)return 0;
        return 1+Math.max(height(root.left), height(root.right));

    }
    //minimum value of the tree
    static int minimum(Node root){
        if(root==null)return Integer.MAX_VALUE;
        int sum= Math.min(minimum(root.left),minimum(root.right));
        return Math.min(root.val, sum);
    }
    //product of the tree
    static int product(Node root){
        if(root==null)return 1;
        return root.val*product(root.left)*product(root.right);
    }
    public static void main(String args[]){
        Node root=new Node(10);
        Node a=new Node(11);
        Node b=new Node(14);
        root.left=a;
        root.right=b;
        Node c=new Node(7);
        Node d=new Node(1);
        Node e=new Node(12);
        Node f=new Node(9);
        Node g=new Node(3);
        a.left=c;
        a.right=d;
        d.left=e;
        d.right=f;
        b.right=g;
        System.out.println("we are displaying the binary tree created");
        System.out.println();
        display(root);
        System.out.println("size of the given binary tree is-> "+size(root));
        System.out.println("sum of nodes of BT is-> "+sum(root));
        System.out.println("the maximum value in the BT is-> "+maximum(root));
        System.out.println("height of the binary tree is-> "+height(root));
        System.out.println("the minimum value in the binary tree is-> "+minimum(root));
        System.out.println("product of the BT is-> "+product(root));
    }
}
