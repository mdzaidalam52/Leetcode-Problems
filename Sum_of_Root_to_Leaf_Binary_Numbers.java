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
    public int sumRootToLeaf(TreeNode root) {
        if(root == null)
            return 0;        
        return solve(root, 0);
    }
    
    public int solve(TreeNode root, int a){
        if(root == null)
            return a;
        if(root.left == null && root.right == null)
            return (a << 1) + root.val;
        int ans = 0;           
        if(root.left != null)
            ans += solve(root.left, (a << 1) + root.val);
        if(root.right != null)
            ans += solve(root.right, (a << 1) + root.val);

        return ans;
    }
}

// Code by Md Zaid Alam