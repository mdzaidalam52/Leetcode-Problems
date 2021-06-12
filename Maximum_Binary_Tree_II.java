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
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if(root.val < val){
            TreeNode ans = new TreeNode(val, root, null);
            return ans;
        }
        insert(root, root.right, val);
        return root;
    }
    
    public void insert(TreeNode root, TreeNode right, int val){
        if(right == null || right.val < val){
            TreeNode n = new TreeNode(val, right, null);
            root.right = n;
            return;
        }        
        insert(right, right.right, val);
        
    }
}

// Code by Md Zaid Alam