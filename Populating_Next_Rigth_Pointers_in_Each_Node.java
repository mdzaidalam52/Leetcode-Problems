/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null || root.left == null){
            return root;
        }
        Node ans  = root;
        Node next = root.left;
        root.left.next = root.right;
        Node child = root.right;
        while(root != null){
            if(root.next == null){
                root = next;
                if(root != null && root.left != null){
                    next = root.left;
                    next.next = root.right;
                    child = root.right;
                }else{
                    next = null;
                }
            }else{
                root = root.next;
                if(root.left != null){
                    child.next = root.left;
                    child.next.next = root.right;
                    child = root.right;
                }
            }
        }
        return ans;
    }
    
}

// Code by Md Zaid Alam