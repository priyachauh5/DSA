//implementing stack using ArrayList

import java.util.ArrayList;

public class stack{
    static class Stack{ //stack class ke andar array list create karenge
        static ArrayList<Integer> list=new ArrayList<>();
        //isEmpty
        public static boolean isEmpty(){ //check whether stack is empty or not
            return list.size()==0;
        }

        //push
        public static void push(int data){
            list.add(data); //add data at last index of array
        }//automatically data is added to stack top

        //pop
        public static int pop(){ //befor deleting we store it and then return default implementation 
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);//stored at last index of arraylist so pop it single operation mai kaam karta hai then TC=O(1)
            list.remove(list.size()-1); //O(1)
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek()); //look
            s.pop(); //delete
        }
    }
}