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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        level(root, ans, 0);
        return ans;
    }
    
    public void level(TreeNode root, List<List<Integer>> ans, int ind){
        if(root == null){
            return;
        }
        if(ans.size() <= ind){
            ans.add(new ArrayList<>());
        }
        ans.get(ind).add(root.val);
        level(root.left, ans, ind+1);
        level(root.right, ans, ind+1);
        
    }
}

// Code by Md Zaid Alam