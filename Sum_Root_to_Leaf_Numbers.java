/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int total;

    public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;
        total = 0;
        solve(root, 0);
        return total;
    }

    void solve(TreeNode root, int sum) {
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            total += sum;
            return;
        }
        if (root.left != null)
            solve(root.left, sum);
        if (root.right != null)
            solve(root.right, sum);
    }
}

// Code by Md Zaid Alam