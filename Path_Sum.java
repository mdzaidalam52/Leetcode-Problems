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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        return solve(root, targetSum);
    }
    boolean solve(TreeNode root, int k){
        if(root.left == null && root.right == null){
            return k == root.val;
        }
        boolean ans = false;
        if(root.left != null){
            ans = ans || solve(root.left, k - root.val);
        }
        if(root.right != null){
            ans = ans || solve(root.right, k - root.val);
        }
        return ans;
    }
}

// Code by Md Zaid Alam