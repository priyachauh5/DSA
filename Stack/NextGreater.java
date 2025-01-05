import java.util.Stack;
public class nextGreater{
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        int arr[]={6,8,0,1,3};
        int nextGreater[]=new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            //while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){  //arr[4]<=arr[3]
                s.pop();
            }
            //if else
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=arr[s.peek()]; //arr[4]
            }
            //push
            s.push(i); //push index
        }
        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
}

//next Greater Right
//next Greater Left
//next Smaller Right
//next Smaller Left 