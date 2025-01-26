import java.util.PriorityQueue;

public class ConnectRopes{
    public static void main(String args[]){
        int ropes[]={2,3,3,4,6};

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0; i<ropes.length; i++){
            pq.add(ropes[i]);
        }
        int cost=0;
        while(pq.size()>1){
            int min=pq.remove();
            int min2=pq.remove();
            cost+=min+min2;
            pq.add(min+min2); //again add in  heap i.e priorityqueue
        }
        System.out.println("Cost of connecting n ropes= "+cost);
    }
}