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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if(root == null)
            return l;
        inorder(root, l);
        return l;
    }
    
    public void inorder(TreeNode root, List<Integer> l){
        if(root.left != null)
            inorder(root.left, l);
        l.add(root.val);
        if(root.right != null)
            inorder(root.right, l);
    }
}

// Code by Md Zaid Alam