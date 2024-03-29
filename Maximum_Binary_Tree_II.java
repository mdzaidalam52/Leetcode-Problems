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
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        arr.add(val);
        return solve(arr, 0, arr.size() - 1);
    }

    void inorder(TreeNode root, ArrayList<Integer> arr) {
        if (root == null)
            return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }

    TreeNode solve(ArrayList<Integer> a, int s, int e) {
        if (s == e) {
            return new TreeNode(a.get(s));
        } else if (s > e)
            return null;

        int maxInd = s;
        for (int i = s + 1; i <= e; i++) {
            if (a.get(maxInd) < a.get(i))
                maxInd = i;
        }
        TreeNode node = new TreeNode(a.get(maxInd));
        node.left = solve(a, s, maxInd - 1);
        node.right = solve(a, maxInd + 1, e);
        return node;
    }
}

// Code by Md Zaid Alam