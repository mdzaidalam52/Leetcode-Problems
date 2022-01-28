class Solution {
    public int findMaximumXOR(int[] nums) {
        Trie t = new Trie();
        for(int i: nums){
            t.insert(i);
        }
        int ans = 0;
        for(int i: nums){
            int key = i^Integer.MAX_VALUE;
            key = t.query(key);
            ans = Math.max(ans, key^i);
        }
        return ans;
    }
    
    class Trie{
        
        class Node{
            Node z, o;
        }
        
        Node root;
        Trie(){
            root = new Node();
        }
        
        void insert(int num){
            int ind = 30;
            Node current = root;
            while(ind >= 0){
                if((num&(1<<ind)) > 0){
                    if(current.o == null){
                        current.o = new Node();
                    }
                    current = current.o;
                }else{
                    if(current.z == null){
                        current.z = new Node();
                    }
                    current = current.z; 
                }
                ind--;
            }
        }
        
        int query(int num){
            int val = 0;
            Node current = root;
            int ind = 30;
            while(ind >= 0){
                val = val << 1;
                int k = num&(1<<ind);
                if(k > 0){
                    if(current.o != null){
                        val += 1;
                        current = current.o;
                    }else{
                        current = current.z;
                    }
                }else{
                    if(current.z != null){
                        current = current.z;
                    }else{
                        val+= 1;
                        current = current.o;
                    }
                }
                ind--;
            }
            return val;
        }
    }
}

// Code by Md Zaid Alam