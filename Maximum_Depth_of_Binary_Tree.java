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
    public int maxDepth(TreeNode root) {
        int ans = check(root, 0);
        return ans;
    }
    
    public int check(TreeNode root, int ans){
        if(root == null)
            return ans;
        
        return Math.max(check(root.left, ans+1), check(root.right, ans + 1));
    }
}

// Code by Md Zaid Alam