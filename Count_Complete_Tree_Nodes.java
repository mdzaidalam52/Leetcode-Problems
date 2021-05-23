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
    public int countNodes(TreeNode root) {
        if(root == null)
            return 0;
        int ans = count(root.left);
        ans += count(root.right);
        return ans + 1;
    }
    
    public int count(TreeNode root){
        if(root == null)
            return 0;
        
        int ans = count(root.right);
        ans += count(root.left);
        return ans + 1;
    }
}

// Code by Md Zaid Alam