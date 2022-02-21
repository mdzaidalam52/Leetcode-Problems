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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return balanceBST(arr, 0, arr.size() - 1);
    }
    
    TreeNode balanceBST(ArrayList<Integer> arr, int s, int e){
        if(s > e || s < 0 || e >= arr.size())
            return null;
        if(s == e){
            TreeNode t = new TreeNode(arr.get(s));
            return t;
        }
        int mid = (s+e)/2;
        TreeNode t = new TreeNode(arr.get(mid));
        t.left = balanceBST(arr, s, mid - 1);
        t.right = balanceBST(arr, mid+1, e);
        return t;
    }
    
    void inorder(TreeNode root, ArrayList<Integer> arr){
        if(root == null)
            return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
}

// Code by Md Zaid Alam