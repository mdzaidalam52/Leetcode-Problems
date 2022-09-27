class Solution {
    public int[] sumPrefixScores(String[] words) {
        int n = words.length;
        int[] ans = new int[n];
        Trie t = new Trie();
        for(int i = 0; i < n; i++){
            t.add(words[i]);
        }
        for(int i = 0; i < n; i++){
            ans[i] = t.get(words[i]);
        }
        return ans;
    }
    
    class Trie{
        class Node{
            Node[] a;
            int val;
            Node(){
                this.a = new Node[26];
            }
        }
        
        Node root;
        
        Trie(){
            root = new Node();
        }
        
        void add(String str){
            Node node = root;
            for(char c: str.toCharArray()){
                if(node.a[c-'a'] == null){
                    node.a[c-'a'] = new Node();
                }
                node = node.a[c-'a'];
                node.val++;
            }
        }
        
        int get(String str){
            Node node = root;
            int ans = 0;
            for(char c: str.toCharArray()){
                node = node.a[c-'a'];
                ans += node.val;
            }
            return ans;
        }
    }
}

// Code by Md Zaid Alam