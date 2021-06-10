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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || (root.left == null && root.right == null))
            return 0;
        int a = 0;
        if(root.left != null){
            a = left(root.left, true);
        }
        
        if(root.right != null)
            a += left(root.right, false);
        
        return a;
        
    }
    
    int left(TreeNode root, boolean bool){
        if(root.left == null && root.right == null){
            return bool ? root.val : 0;
        }
        int a = 0;
        if(root.left != null)
            a += left(root.left, true);
        
        if(root.right != null)
            a += left(root.right, false);
        
        return a;
    }
    
}

// Code by Md Zaid Alam