public class QueueInArray{
    static class Queue{
        static int arr[]; //stimulate array
        static int size;
        static int rear;

        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1; //initialize with empty
            front=-1;
        }

        public static boolean isEmpty(){
            return rear==-1 && front=-1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        
        //add
        public static void add(int data){
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
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int result=arr[front];
            front=(front+1)%size;
            //last el delete
            if(rear==front){
                rear=front=-1;
            }
            return result;
        }
    }
    

    public static void main(String args[]){
        Queue q=new Queue(5); //creating object and passing the size of the queue
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}