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
    public int widthOfBinaryTree(TreeNode root) {
        int ans = 1;
        Queue<Data> q = new LinkedList<>();
        q.add(new Data(root, 0));
        while (!q.isEmpty()) {
            int k = q.size();
            int s = q.peek().pos;
            int e = s;
            while (k-- > 0) {
                Data t = q.remove();
                if (t.t.left != null) {
                    q.add(new Data(t.t.left, 2 * t.pos));
                }
                if (t.t.right != null) {
                    q.add(new Data(t.t.right, 2 * t.pos + 1));
                }
                e = t.pos;
            }
            ans = Math.max(ans, e - s + 1);
        }
        return ans;
    }

    class Data {
        TreeNode t;
        int pos;

        Data(TreeNode t, int pos) {
            this.t = t;
            this.pos = pos;
        }
    }
}

// Code by Md Zaid Alam