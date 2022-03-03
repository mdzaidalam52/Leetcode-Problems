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
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null)
            return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while (!q.isEmpty()) {
            int k = q.size();
            int prev = ((level & 1) == 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            while (k-- > 0) {
                TreeNode t = q.remove();
                if ((t.val % 2) == (level % 2) || (level % 2 == 0 ? (prev >= t.val) : (prev <= t.val)))
                    return false;
                else
                    prev = t.val;
                if (t.left != null)
                    q.add(t.left);
                if (t.right != null)
                    q.add(t.right);
            }
            level++;
        }
        return true;
    }
}

// Code by Md Zaid Alam