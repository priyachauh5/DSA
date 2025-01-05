import java.util.Stack;
public class Parenthesis{
    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();
        //opening
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }
            else{
                //closing
                if(s.isEmpty()){ //if all are closing or all are opening
                    return false;
                }
                if((s.peek()=='(' && ch==')') || (s.peek()=='{' && ch=='}') || (s.peek()=='[' && ch==']')){
                    s.pop();
                }else{
                    return false; //Not matching
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{ //if some parenthesis are remaining
            return false;
        }
    } 

    public static void main(String args[]){
        String str="({})[]"; //true
        System.out.print(isValid(str));
    }
}