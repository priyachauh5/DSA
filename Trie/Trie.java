public class Trie{
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false; //end of word

        Node(){ //no value data only track through index
            for(int i=0; i<26; i++){ //initialize children node with null
                children[i]=null;
            }
        }
    }

    public static Node root=new Node();

    public static void main(String args[]){
        String words[]={"the","a","there","their","any","thee"};
    }
}