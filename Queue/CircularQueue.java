public class QueueInArray{
    static class Queue{
        static int arr[]; //stimulate array
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1; //initialize with empty
            front=-1;
        }

        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front; //perfesctly forms circular queue then full
        }
        
        //add
        public static void add(int data){ //O(1)
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            //add 1st element
            //if we are adding element at first time
            //then rear,front=-1 then rear change to 0
            //then we need to change the front
            //adding first element
            if(front==-1){
                front=0;
            }
          
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //remove
        public static int remove(){  //O(1)
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int result=arr[front];
            // front=(front+1)%size;
            //last el delete
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
        }

         //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];
        }
    
    }

    public static void main(String args[]){
        Queue q=new Queue(3); //creating object and passing the size of the queue
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