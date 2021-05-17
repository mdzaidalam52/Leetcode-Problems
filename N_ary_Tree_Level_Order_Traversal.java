/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        q.add(root);
        int a = 1;
        int level = 0;
        while(!q.isEmpty()){
            ans.add(new ArrayList<>());
            int l = 0;
            for(int i = 0; i < a; i++){
                if(q.peek().children != null){
                    l += q.peek().children.size();
                    for(Node n : q.peek().children){
                        q.add(n);
                    }
                }                
                ans.get(level).add(q.poll().val);
            }
            level++;
            a = l;
        }
        return ans;
    }
}

// Code by Md Zaid Alam