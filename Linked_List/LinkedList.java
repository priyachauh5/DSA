public class LinkedList{
    public static class Node{ //node class is create inside LinkedList
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    //Methods
    //add()
    //remove()
    //print()
    // search()

    //There is only one head and only one tail, they both are define as a property in this class
    public static void main(String args[]){
        //To create linked list inside main class
        LinkedList ll=new LinkedList(); //same linkedList class ki object is created "ll" in this object all nodes are created
        //create node inside object
        ll.head=new Node(1); //new node is created with data 1
        ll.head.next=new Node(2); //points to new node where data is stored 2
    }
}
//all operations to create head and tail is managed by creating method to perform add, delete, etc operations we does not write code in main class we creates methods
//Methods are created inside LinkedList class

//Methods
//add()
//remove()
//print()
// search()