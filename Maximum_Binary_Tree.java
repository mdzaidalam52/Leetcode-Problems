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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return solve(nums, 0, nums.length - 1);
    }

    TreeNode solve(int[] a, int s, int e) {
        if (s == e) {
            return new TreeNode(a[s]);
        } else if (s > e)
            return null;

        int maxInd = s;
        for (int i = s + 1; i <= e; i++) {
            if (a[maxInd] < a[i])
                maxInd = i;
        }
        TreeNode node = new TreeNode(a[maxInd]);
        node.left = solve(a, s, maxInd - 1);
        node.right = solve(a, maxInd + 1, e);
        return node;
    }

}

// Code by Md Zaid Alam