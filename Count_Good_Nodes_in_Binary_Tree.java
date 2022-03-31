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
    int count = 0;

    public int goodNodes(TreeNode root) {
        count = 1;
        solve(root.left, root.val);
        solve(root.right, root.val);
        return count;
    }

    public void solve(TreeNode root, int val) {
        if (root == null)
            return;
        if (val <= root.val) {
            val = root.val;
            count++;
        }
        solve(root.left, val);
        solve(root.right, val);
    }
}

// Code by Md Zaid Alam