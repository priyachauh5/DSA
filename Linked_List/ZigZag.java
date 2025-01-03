//O(nlogn)

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // Create a new node
        Node newNode = new Node(data);
        size++;

        // If the list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Attach at the beginning
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        // Create a new node
        Node newNode = new Node(data);
        size++;

        // If the list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Attach at the end
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int idx, int data) {
        if (idx == 0) { // Add at the head
            addFirst(data);
            return;
        }

        // Check bounds
        if (idx > size) {
            System.out.println("Index out of bounds");
            return;
        }

        Node temp = head;
        int i = 0;

        // Traverse to the node just before the index
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // Insert new node
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void sigzag(){
        //Case1: mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        //case2: Reverse 2nd half
        Node prev=null;
        Node curr=mid.next;
        mid.next=null;
        Node next;
        while(curr!=null){ //3 variable 4steps
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL, nextR;

         //case3: alt merge-zig-zag merge
        while(left!=null && right!=null){
            nextL=left.next; //store
            left.next=right; //point
            nextR=right.next; //store
            right.next=nextL; //point

            left=nextL;
            right=nextR
        }

    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        //5->4->3->2->1
        ll.print();
        ll.zigZag();
        ll.print();
    }
}
