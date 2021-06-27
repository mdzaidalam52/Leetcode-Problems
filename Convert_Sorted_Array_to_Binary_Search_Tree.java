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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode node = new TreeNode(nums[nums.length/2]);
        build(node, 0, nums.length/ 2 - 1, true, nums);
        build(node, nums.length/2 + 1, nums.length - 1, false, nums);
        return node;
    }
    
    public void build(TreeNode root, int s, int e, boolean left, int[] a){
        if(s == e){
            if(left){
                root.left = new TreeNode(a[s]);
            }else{
                root.right = new TreeNode(a[e]);
            }
            return;
        }
        if(s > e)
            return;
        
        int mid = (s+e)/2;
        
        if(left){
            root.left = new TreeNode(a[mid]);
            build(root.left, s, mid-1, true, a);
            build(root.left, mid+1, e, false, a);
        }else{
            root.right = new TreeNode(a[mid]);            
            build(root.right, s, mid-1, true, a);
            build(root.right, mid+1, e, false, a);            
        }
    }
}

// Code by Md Zaid Alam