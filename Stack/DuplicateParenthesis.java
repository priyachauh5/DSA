import java.util.Stack;
public class DuplicateParenthesis{ //O(n)
    public static boolean DuplicateParenthesis(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);

            //closing
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; //duplicate
                }else{
                    s.pop(); //opening pair pop
                }
                // while(s.pop()!='('){
                //     count++;
                // }
                // if(count<1){
                //     return true; //duplicate
                // }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;

    }
    public static void main(String args[]){
        //Valid String 
        String str="(a+b)";
        System.out.print(DuplicateParenthesis(str));
    }
}