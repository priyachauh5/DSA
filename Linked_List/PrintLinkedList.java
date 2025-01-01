public class PrintLinkedList{ 
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

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
        // if(head==null){ //bydefault head is empty tail can also be empty
        //     head=tail=newNode;
        //     return;
        // }
        //case2: tail.next=newNode;
        tail.next=newNode;
        //case3: tail=newNode;
        tail=newNode;
    }

    public void print(){ //O(n)
        // if(head==null){
        //     System.out.println("LL is empty");
        //     return;
        // }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        PrintLinkedList ll=new PrintLinkedList(); //LinkedList is created
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}