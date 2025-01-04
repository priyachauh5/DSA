//Remove First
//Remove last

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
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head; 
        head = newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
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
        size++;
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

    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE; //-infinity ko return kiya hai kyuki koi valid data nahi tha kisi node ke andar
        }else if(size==1){ //head bhi null tail bhi null banega
            int val=head.data; //jo value ko delete karna hai
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev=i-2
        Node prev=head;
        for(int i=0; i<size-1; i++){
            prev=prev.next;
        }
        int val=prev.next.data; //tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public static void main(String args[]){
        PrintLinkedList ll=new PrintLinkedList(); //LinkedList is created
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
    }
}