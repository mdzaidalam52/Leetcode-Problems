/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        List<Integer> a = new ArrayList<>();
        TreeNode n;
        Stack<TreeNode> q = new Stack<>();
        Stack<TreeNode> s = new Stack<>();
        q.push(root);
        while(true){
            if(q.isEmpty())
                return ans;
            a = new ArrayList<>();
            while(!q.isEmpty()){
                n = q.pop();
                a.add(n.val);
                if(n.left != null)
                    s.push(n.left);
                if(n.right != null)
                    s.push(n.right);
            }
            ans.add(a);
        
            if(s.isEmpty())
                return ans;
            a = new ArrayList<>();
            while(!s.isEmpty()){
                n = s.pop();
                a.add(n.val);
                if(n.right != null)
                    q.push(n.right);
                if(n.left != null)
                    q.push(n.left);
            }
            ans.add(a);
        }
    }
}

// Code by Md Zaid Alam