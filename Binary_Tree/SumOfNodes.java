import java.util.*;
public class TreeHeight{
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int Sum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=Sum(root.left);
        int rightSum=Sum(root.right);
        return leftSum+rightSum+root.data;
    }

    public static void main(String args[]){
        /*
            1
           / \
          2   3
         / \ / \
        4  5 6  7
               / \
               8  9
        */

       Node root=new Node(1); //obj is ceated
       root.left=new Node(2);
       root.right=new Node(3);
       root.left.left=new Node(4);
       root.left.right=new Node(5);
       root.right.left=new Node(6);
       root.right.right=new Node(7);
       root.right.right.left=new Node(8);
       root.right.right.right=new Node(9);
       
       System.out.println(Sum(root));
    }
}