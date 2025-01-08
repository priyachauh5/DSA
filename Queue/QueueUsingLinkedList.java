public class QueueInArray{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        
        //add
        public static void add(int data){ //O(1) tail per change kar karhe hai tho yeek node per change ho raha hai at head
           Node newNode=new Node(data);
           if(head==null){
            head=tail=newNode;
            return;
           }
           tail.next=newNode;
           tail=newNode;
        }

        //remove
        public static int remove(){  //O(1) //bus hed per change hua hai
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int front=head.data;
            //single element
            if(tail==head){
                tail=head=null;
            }else{
                head=head.next;
            }
            return front;
        }

         //peek
        public static int peek(){ //O(1) head ka data bus return ho raha hai 
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return head.data;
        }
    
    }

    public static void main(String args[]){
        Queue q=new Queue(); //creating object and passing the size of the queue
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove()); //conditions only for circular queue
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
