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
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left != null && root.right != null)
            return Math.min(Depth(root.left, 1), Depth(root.right, 1));
        else if(root.right != null)
            return Depth(root.right, 1);
        else if(root.left != null)
            return Depth(root.left, 1);
        else 
            return 1;
    }
    
    public int Depth(TreeNode root, int d){
        if(root.right == null && root.left == null)
            return d+1;
        if(root.right != null && root.left != null)
            return Math.min(Depth(root.left, d+1), Depth(root.right, d+1));
        if(root.left != null)
            return Depth(root.left, d+1);
        else
            return Depth(root.right, d+1);
    }
}

// Code by Md Zaid Alam