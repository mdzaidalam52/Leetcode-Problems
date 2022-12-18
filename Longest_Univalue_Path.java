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
    int ans = 1;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null)
            return 0;
        solve(root);
        return ans-1;
    }

    int solve(TreeNode node){
        int l = 0, r = 0, k = 1;
        if(node.left != null){
            l = solve(node.left);
            if(node.left.val == node.val){
                k += l;
            }
        }
        if(node.right != null){
            r = solve(node.right);
            if(node.right.val == node.val){
                k += r;
            }
        }
        ans = Math.max(ans, k);
        if(node.right != null && node.left != null && node.right.val == node.left.val && node.right.val == node.val){
            return k - Math.min(l, r);
        }else{
            return k;
        }
    }
}

// Code by Md Zaid Alam