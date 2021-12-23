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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return null;
        if(root.val == key){
            if(root.left == null){
                return root.right;
            }
            if(root.right == null)
                return root.left;
            int k = inorder(root, root.right);
            root.val = k;
            return root;
        }else{
            TreeNode parent = root;
            TreeNode child = null;
            if(root.val > key)
                child = root.left;
            else
                child = root.right;
            
            while(child != null && child.val != key){
                parent = child;
                child = child.val > key ? child.left : child.right;
            }
            if(child == null)
                return root;
            if(child.left == null && child.right == null){
                if(parent.val > key)
                    parent.left = null;
                else
                    parent.right = null;
                return root;
            }
            if(child.left == null){
                if(parent.val > key)
                    parent.left = child.right;
                else
                    parent.right = child.right;
                return root;
            }
            if(child.right == null){
                if(parent.val > key)
                    parent.left = child.left;
                else
                    parent.right = child.left;
                return root;
            }
            int k = inorder(child, child.right);
            child.val = k;
            return root;
        }
        
    }
    
    int inorder(TreeNode parent, TreeNode child){
        if(child.left != null){
            return inorder(child, child.left);
        }
        int k = child.val;
        if(parent.val > k)
            parent.left = child.right;
        else
            parent.right = child.right;
        return k;
    }
    
}

// Code by Md Zaid Alam