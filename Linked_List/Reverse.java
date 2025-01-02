public class Search {
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

//next=curr.next
//curr.next=prev
//prev=curr
//curr=next

    public void reverse(){ //O(n)
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        Search ll = new Search();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(3, 9);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
