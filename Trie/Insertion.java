public class Insertion {
    static class Node{
        Node[] children = new Node[26]; // Array of Node objects //O(L) depends on largest word in string
        boolean eow = false; // End of word flag

        // Constructor for Node
        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null; // Initialize the children array to null
            }
        }
    }
    

    // Static root node for the Trie
    public static Node root = new Node();

    // Method to insert a word into the Trie
    public static void insert(String word) { 
        Node curr = root; // Start at the root of the Trie
        for (int level = 0; level < word.length(); level++) { // Traverse each character in the word
            int idx = word.charAt(level) - 'a'; // Calculate index based on the character
            if (curr.children[idx] == null) { // If no node exists at that index, create one
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx]; // Move to the next node in the Trie
        }
        curr.eow = true; // Mark the end of the word
    }

    public static boolean search(String key){ //O(L)
        Node curr=root;
        for(int level=0; level<key.length(); level++){
            int idx=key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow = true;
    }

    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]); // Insert each word into the Trie
        }
        System.out.println(search("thee"));
        System.out.println(search("thor"));
    }
}
