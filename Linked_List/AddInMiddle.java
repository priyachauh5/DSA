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
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head; 
        head = newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){ //O(n)
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx==0){ //when we have to add data at the head then call to addFirst
            addFirst(data); //so that head could handle
            return;
        }
        Node newNode=new Node(data); //create a node
        Node temp=head;
        int i=0;
        while(i<idx-1){ //prev
            temp=temp.next;
            i++;
        }
        //i=idx-1; temp->prev
        newNode.next=temp.next;
        temp.next=newNode; //add in middle
    }

    public static void main(String args[]){
        PrintLinkedList ll=new PrintLinkedList(); //LinkedList is created
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,9);
        ll.print();
    }
}