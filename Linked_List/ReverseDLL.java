public class DoubleLL{
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //Create new Node;
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    //remove-removeFirst
    public int removeFirst(){
        if(head==null){
            System.out.print("DLL is Empty");
            return Integer.MIN_VALUE;
        }if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    //remove last
    public int removeLast(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }if(size==1){ //only one is present
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        
        // More than one node exists, remove the tail node
        int val = tail.data;
        tail = tail.prev;  // Move tail to the previous node
        tail.next = null;   // Set the next reference of the new tail to null
        size--;
    
    return val;
    }

    public void print(){
        if(head==null){
            System.out.println("Doubly Linked List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next; //next ko bana do curr ka next
            curr.next=prev;
            curr.prev=next; //current ka prev next ko point kare
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String args[]){
        DoubleLL dll=new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.reverse();
        dll.print();
    }
}