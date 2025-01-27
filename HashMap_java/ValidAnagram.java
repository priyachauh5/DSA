import java.util.HashMap;

public class ValidAnagram{
    public static boolean isAnagram(String s, String t){ //O(n)
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> map=new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int i=0; i<t.length(); i++){
            char ch=t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String args[]){
        String s="race"; //O(n) where n is the no. of character in the string
        String t="care";
        System.out.println(isAnagram(s,t));
    }
}

