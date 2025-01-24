import java.util.*;
public class DeleteNode{
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data=data;
        }
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

     public static Node insert(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left, val);
        }
        else{
            root.right=insert(root.right, val);
        }
        return root;
    }

    public static boolean isValidBST(Node root, Node min, Node max){
        if(root==null){
            return true;
        }
        //invalid case
        if(min!=null && root.data<=min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }
        //valid case
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void main(String args[]){
        // int values[]={8,5,3,1,4,6,10,11,14};
        int values[]={1,1,1};
        Node root=null;
        for(int i=0; i<values.length; i++){
            root=insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        if(isValidBST(root, null, null)){
            System.out.println("Valid");
        }else{
            System.out.println("Not valid");
        }
    }
}