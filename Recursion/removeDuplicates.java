// Remove Duplicates from Sorted Array

public class removeDuplicates{
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.print(newStr);
            return;
        }
        //kaam
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String args[]){
        String str="appnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}