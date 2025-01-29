public class Trie{
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false; //end of word

        public Node(){ //no value data only track through index
            for(int i=0; i<26; i++){ //initialize children node with null
                children[i]=null;
            }
        }
    }

    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for(int level=0; level<word.length(); level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    public static boolean search(String key){
        Node curr=root;
        for(int level=0; level<key.length(); level++){
            int idx=key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow=true;
    }

    public static boolean wordBreak(String key){ //O(L) linear time complexity question
        if(key.length()==0){
            return true; //string break hote hote first part mai chala gaya hai then return true; as second part is empty string
        }
        for(int i=1; i<=key.length(); i++){
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        String arr[]={"i","like","sam","samsung","mobile","ice"};
        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }
        String key="ilikesamsung";
        System.out.println(wordBreak(key));
    }
}