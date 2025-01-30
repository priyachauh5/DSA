public class LongestWordWithallPrefixes {

    static class Node {
        Node[] children = new Node[26];
        boolean eow = false; // End of word flag
        int freq;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 0;
        }
    }

    static Node root = new Node(); // Initialize the root node of the Trie
    public static String ans = "";

    // Insert method to insert words into the trie
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node(); // Create a new node if not present
            }
            curr = curr.children[idx];
        }
        curr.eow = true; // Mark the end of word
    }

    // Method to find the longest word that has all prefixes
    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) { //we can convert alphabetically larger value
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1); // Backtracking
            }
        }
    }

    public static void main(String args[]) {
        String word[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        // Insert words into the trie
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }

        // Find the longest word
        longestWord(root, new StringBuilder(ans));
        System.out.println(ans);
    }
}
