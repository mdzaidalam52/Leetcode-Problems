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
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode node = root;
        solve(root.left, q);
        solve(root.right, q);
        while (!q.isEmpty()) {
            node.left = null;
            node.right = q.remove();
            node = node.right;
        }

    }

    public void solve(TreeNode node, Queue<TreeNode> q) {
        if (node == null)
            return;
        q.add(node);
        solve(node.left, q);
        solve(node.right, q);
    }
}

// Code by Md Zaid Alam