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
    public int maxAncestorDiff(TreeNode root) {
        return Math.max(solve(root.left, root.val, root.val), solve(root.right, root.val, root.val));
    }
    public int solve(TreeNode root, int max, int min){
        if(root == null){
            return max - min;
        }
        return Math.max(solve(root.left, Math.max(root.val, max), Math.min(root.val, min)), solve(root.right, Math.max(root.val, max), Math.min(root.val, min)));
    }
}

// Code by Md Zaid Alam