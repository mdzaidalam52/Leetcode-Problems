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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root.left != null){
            search(root.left, ans, new StringBuilder(Integer.toString(root.val)));
        }
        if(root.right != null){
            search(root.right, ans, new StringBuilder(Integer.toString(root.val)));
        }
        if(root.left == null && root.right == null){
            ans.add(Integer.toString(root.val));
        }
        return ans;
        
    }
    
    public void search(TreeNode root, List<String> ans, StringBuilder str){
        str.append("->" + Integer.toString(root.val));
        
        if(root.left == null && root.right == null){
            ans.add(str.toString());
            str.delete(str.length() - Integer.toString(root.val).length() - 2, str.length());
            return;
        }
        
        if(root.left != null)
            search(root.left, ans, str);
        
        if(root.right != null)
            search(root.right, ans, str);
        
        str.delete(str.length() - Integer.toString(root.val).length() - 2, str.length());
            
    }
}

// Code by Md Zaid Alam