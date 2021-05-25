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
    public TreeNode pruneTree(TreeNode root) {
        if(root == null)
            return null;
        boolean boolL = false, boolR = false;
        if(root.left != null)
            boolL = check(root.left);
        if(root.right != null)
            boolR = check(root.right);
        if(!boolL){
            root.left = null;
        }
        if(!boolR){
            root.right = null;
        }
        if(root.val == 0 && !boolL && !boolR){
            return null;
        }else{
            return root;
        }
    }
    
    boolean check(TreeNode root){
        boolean boolL = false, boolR = false;
        if(root.left != null)
            boolL = check(root.left);
        if(root.right != null)
            boolR = check(root.right);
        if(!boolL)
            root.left = null;
        if(!boolR)
            root.right = null;
        if(root.val == 0 && !boolL && !boolR)
            return false;
        else
            return true;
    }
}

// Code by Md Zaid Alam