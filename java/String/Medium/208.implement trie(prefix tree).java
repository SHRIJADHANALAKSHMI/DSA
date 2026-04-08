class Trie {

    // Node class
    class Node {
        Node[] children = new Node[26];
        boolean isEnd = false;
    }

    private Node root;

    // Constructor
    public Trie() {
        root = new Node();
    }
    
    // Insert word
    public void insert(String word) {
        Node curr = root;
        
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            
            curr = curr.children[index];
        }
        
        curr.isEnd = true;
    }
    
    // Search exact word
    public boolean search(String word) {
        Node curr = root;
        
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            
            if (curr.children[index] == null) {
                return false;
            }
            
            curr = curr.children[index];
        }
        
        return curr.isEnd;
    }
    
    // Check prefix
    public boolean startsWith(String prefix) {
        Node curr = root;
        
        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';
            
            if (curr.children[index] == null) {
                return false;
            }
            
            curr = curr.children[index];
        }
        
        return true;
    }
}