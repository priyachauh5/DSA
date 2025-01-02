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

    public int itrSearch(int data) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == data) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        // Key not found
        return -1;
    }

    public int helper(Node head, int key){ //O(n)
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public static void main(String[] args) {
        Search ll = new Search();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(3, 9);
        ll.print();

        System.out.println(ll.itrSearch(3)); // Output: 2
        System.out.println(ll.itrSearch(10)); // Output: -1

        System.out.println(ll.recSearch(6)); // Output: 2
        System.out.println(ll.recSearch(90)); // Output: -1
    }
}
