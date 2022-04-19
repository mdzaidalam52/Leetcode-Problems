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
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        solve(root.left, arr, k);
        arr.add(root.val);
        solve(root.right, arr, k);
        return arr.get(k-1);
    }
    
    void solve(TreeNode root, ArrayList<Integer> arr, int k){
        if(arr.size() >= k)
            return;
        if(root == null)
            return;
        solve(root.left, arr, k);
        arr.add(root.val);
        solve(root.right, arr, k);
    }
}

// Code by Md Zaid Alam