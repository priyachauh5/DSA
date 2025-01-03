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

    //Slow-fast Approach
    public Node findMid(Node head){ //helper
        Node slow=head;
        Node fast=head; //initialization with head i.e start
        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
        }
        return slow; //slow is my midNode
    }
    public static boolean checkPalindrome(){
        if(head==null || head.next==null){ // when single node is present
            return true;
        }
        //case1 find mid
        Node midNode=findMid(head);
        //case2 reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev; //right half head
        Node left=head;
        //step3- check lefthalf and righthalf
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(2);
        ll.print();
        System.out.println(ll.checkPalindrome());
    }
}
