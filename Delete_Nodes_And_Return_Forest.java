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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> list = new ArrayList<>();
        if(!delete(root, list, to_delete)) list.add(root);
        return list;
    }
    boolean delete(TreeNode root, List<TreeNode> list, int[] del){
        if(root == null)
            return false;
        if(delete(root.left, list, del)){
            root.left = null;
        }
        if(delete(root.right, list, del)){
            root.right = null;
        }
        
        if(contains(root.val, del)){
            if(root.right != null)
                list.add(root.right);
            if(root.left != null)
                list.add(root.left);
            return true;
        }
        return false;
    }
    
    boolean contains(int k, int[] del){
        for(int i : del)
            if(k == i)
                return true;
        return false;
    }
}

// Code by Md Zaid Alam