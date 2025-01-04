import java.util.Stack;

public class StockSpan{
    public static void stockSpan(int stock[], int span){
        Stack<Integer> s=new Stack<>();
        span[0]=1; //start mai 1 hoga span
        s.push(0);
        for(int i=1; i<stock.length; i++){
            int currPrice=stock[i]; //second position placed as current at start
            while(!s.isEmpty() && currPrice>stock[s.peek()]){
                s.pop(); //to remove smaller element
            }
            if(s.isEmpty()){
                span[i]=i+1; //last to get
            }else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String args[]){
        int stock[]={100, 80, 60, 70, 60,85, 100};
        int span[]=new int[stock.length];
        for(int i=0; i<span.length; i++){
            System.out.println(span[i]+" ");
        }
    }
}