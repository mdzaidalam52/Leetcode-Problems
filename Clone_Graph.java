/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null)
            return null;
        return clone(node, new HashMap<>());
    }
    
    public Node clone(Node node, HashMap<Integer, Node> map){
        if(map.containsKey(node.val)){
            return map.get(node.val);
        }
        
        Node root = new Node(node.val);
        map.put(node.val, root);
        for(int i = 0; i < node.neighbors.size(); i++){
            root.neighbors.add(clone(node.neighbors.get(i), map));
        }
        return root;
    }
}

// Code by Md Zaid Alam