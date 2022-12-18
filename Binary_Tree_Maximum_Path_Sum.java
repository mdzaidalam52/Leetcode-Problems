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
    int ans = 0;
    public int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;
        int left = solve(root.left);
        int right = solve(root.right);
        ans = Math.max(root.val + left, ans);
        ans = Math.max(root.val + right, ans);
        ans = Math.max(root.val + right + left, ans);
        ans = Math.max(root.val, ans);
        return ans;
    }
    
    public int solve(TreeNode root){
        if(root == null)
            return 0;
        ans = Math.max(ans, root.val);
        int left = solve(root.left);
        int right = solve(root.right);
        ans = Math.max(left + root.val, ans);
        ans = Math.max(root.val + right, ans);
        ans = Math.max(root.val + right + left, ans);
        
        return Math.max(left, Math.max(0, right)) + root.val;
    }
}

// Code by Md Zaid Alam