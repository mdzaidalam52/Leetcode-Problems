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
    public int sumEvenGrandparent(TreeNode root) {
        return solve(root, 1, 1);
    }
    
    public int solve(TreeNode root, int a, int b){
        if(root == null)
            return 0;
        int ans = (a&1) == 0 ? root.val : 0;
        a = b;
        b = root.val;
        ans += solve(root.left, a, b);
        ans += solve(root.right, a, b);
        return ans;
    }
}

// Code by Md Zaid Alam