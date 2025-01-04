import java.util.*;

public class stack{
    public static void main(String args[]){
        // Stack s=new Stack();
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){ //this function already exists in java
            System.out.println(s.peek()); //look
            s.pop(); //delete
        }
    }
}