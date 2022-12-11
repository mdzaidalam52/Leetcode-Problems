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
    final int mod = 1000000007;
    long ans = 0;
    int total = 0;

    public int maxProduct(TreeNode root) {
        total = findSum(root);
        solve(root);
        return (int)(ans%mod);
    }

    void solve(TreeNode node){
        if(node == null)
            return;
        if(node.left != null)
            ans = Math.max(ans, ((long)node.left.val)*(total - node.left.val));
        if(node.right != null)
            ans = Math.max(ans, ((long)node.right.val)*(total - node.right.val));
        solve(node.left);
        solve(node.right);
    }

    int findSum(TreeNode root){
        if(root == null)
            return 0;
        int sum = root.val;
        sum = (sum + findSum(root.left))%mod;
        sum = (sum + findSum(root.right))%mod;
        root.val = sum;
        return sum;
    }
}

// Code by Md Zaid Alam