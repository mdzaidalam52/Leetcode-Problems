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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a = new ArrayList<>(), b = new ArrayList<>();
        solve(root1, a);
        solve(root2, b);
        return a.equals(b);
    }

    public void solve(TreeNode node, ArrayList<Integer> arr){
        if(node == null)
            return;
        if(node.left == null && node.right == null)
            arr.add(node.val);
        solve(node.left, arr);
        solve(node.right, arr);
    }
}

// Code by Md Zaid Alam