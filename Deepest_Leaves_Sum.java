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
    int depth;
    public int deepestLeavesSum(TreeNode root) {
        depth = 0;
        return solve(root, 0);
    }
    int solve(TreeNode root, int d){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null){
            if(d >= depth){
                depth = d;
                return root.val;
            }else{
                return 0;
            }
        }
        int left = solve(root.left, d+1);
        int k = depth;
        int right = solve(root.right, d+1);
        if(k == depth)
            return left + right;
        return right;
    }
}

// Code by Md Zaid Alam