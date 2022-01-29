class Trie {
    class Node {
        Node[] child;
        boolean end;

        Node() {
            child = new Node[26];
            end = false;
        }
    }

    Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node current = root;
        for (char c : word.toCharArray()) {
            if (current.child[c - 'a'] == null) {
                current.child[c - 'a'] = new Node();
            }
            current = current.child[c - 'a'];
        }
        current.end = true;
    }

    public boolean search(String word) {
        Node current = root;
        for (char c : word.toCharArray()) {
            if (current.child[c - 'a'] == null)
                return false;
            current = current.child[c - 'a'];
        }
        return current.end;
    }

    public boolean startsWith(String prefix) {
        Node current = root;
        for (char c : prefix.toCharArray()) {
            if (current.child[c - 'a'] == null)
                return false;
            current = current.child[c - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

// Code by Md Zaid Alam