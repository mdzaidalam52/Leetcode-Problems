class WordDictionary {

    class Node{
        Node[] child;
        boolean end;
        Node(){
            child = new Node[26];
            end = false;
        }
    }
    
    Node root;
    
    public WordDictionary() {
        root = new Node();
    }
    
    public void addWord(String word) {
        Node current = root;
        for(char c: word.toCharArray()){
            if(current.child[c-'a'] == null){
                current.child[c-'a'] = new Node();
            }
            current = current.child[c-'a'];
        }
        current.end = true;
    }
    
    public boolean search(String word) {
        return search(word, root, 0);
    }
    
    boolean search(String word, Node root, int ind){
        if(ind == word.length()){
            return root.end;
        }
        
        if(word.charAt(ind) == '.'){
            for(int i = 0; i < 26; i++){
                if(root.child[i] != null && search(word, root.child[i], ind+1)){
                    return true;
                }
            }
            return false;
        }else{
            if(root.child[word.charAt(ind) - 'a'] == null)
                return false;
            return search(word, root.child[word.charAt(ind) - 'a'], ind+1);
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */

 // Code by Md Zaid Alam