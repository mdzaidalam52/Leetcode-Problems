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
    public String tree2str(TreeNode root) {
        StringBuilder str = new StringBuilder();
        solve(root, str);
        return str.toString();
    }
    
    void solve(TreeNode node, StringBuilder ans){
        if(node == null){
            return;
        }
        ans.append(node.val);
        if(node.left != null){
            ans.append("(");
            solve(node.left, ans);  
            ans.append(")");
        }
        if(node.right != null){
            if(node.left == null){
                ans.append("()");
            }
            ans.append("(");
            solve(node.right, ans);
            ans.append(")");
        }
    }
}

// Code by Md Zaid Alam