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
    public TreeNode convertBST(TreeNode root) {
        if(root == null)
            return root;
        int max = solve(root.right, 0);
        root.val += max;
        solve(root.left, root.val);
        return root;
    }
    int solve(TreeNode root, int max){
        if(root == null)
            return max;
        root.val += solve(root.right, max);
        return solve(root.left, root.val);
    }
}

// Code by Md Zaid Alam