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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null)
            return ans;
        ans.add(root.val);
        right(root.right, 2, ans);
        right(root.left, 2, ans);
        return ans;
    }
    
    public void right(TreeNode root, int level, List<Integer> ans){
        if(root == null){
            return;
        }
        if(level > ans.size()){
            ans.add(root.val);
        }
        right(root.right, level+1, ans);
        right(root.left, level+1, ans);
    }
}

// Code by Md Zaid Alam