//add First O(1)
//add Last O(1)

public class AddInLinkedList{
    public class LinkedList{
        public static class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }

        public static Node head; //defined as a property inside the class
        public static Node tail;

        //listList ke object static ho ya na ho not effects
        //also we can use non static methods
        //classNmae objectName= newKeyword clasname(data is passed to constructor)

        public void addFirst(int data){
            //step1= create new node
            Node newNode=new Node(data);
            //If LinkedList is empty
            if(head==null){
                head=tail=newNode;
                return;
            }

            //step2- newNode next=head;
            newNode.next=head; //Link here linkedList is created 
            //next ke andar head ka reference store ho gaya means address is stored

            //step3 -head=newNode
            head = newNode;
        }

          public void addLast(int data){
        //case1: create new node
        Node newNode=new Node(data);
        //if tail is empty
        if(head==null){ //bydefault head is empty tail can also be empty
            head=tail=newNode;
            return;
        }
        //case2: tail.next=newNode;
        tail.next=newNode;
        //case3: tail=newNode;
        tail=newNode;
    }

        public static void main(String args[]){
            LinkedList ll=new LinkedList();
            //to add elements
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(3);
            ll.addLast(4);
        }
    }
}
