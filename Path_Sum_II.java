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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        solve(root, targetSum, ans, new ArrayList<>());
        return ans;
    }
    
    void solve(TreeNode root, int k, List<List<Integer>> ans, List<Integer> l){
        if(root.left == null && root.right == null){
            if(k == root.val){
                List<Integer> arr = new ArrayList<>();
                arr.addAll(l);
                arr.add(root.val);
                ans.add(arr);
            }
            return;
        }        
        
        l.add(root.val);
        if(root.left != null){
            solve(root.left, k - root.val, ans, l);
        }
        if(root.right != null){
            solve(root.right, k - root.val, ans, l);
        }
        
        l.remove(l.size() - 1);
    }
}

// Code by Md Zaid Alam