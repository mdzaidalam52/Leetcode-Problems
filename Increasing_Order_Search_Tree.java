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
    public TreeNode increasingBST(TreeNode root) {
        if(root == null)
            return null;
        ArrayList<Integer> list = new ArrayList<>();
        add(root, list);
        TreeNode ans = new TreeNode(list.get(0));
        TreeNode n = ans;
        for(int i = 1; i < list.size(); i++){
            n.right = new TreeNode(list.get(i));
            n = n.right;
        }
        return ans;
    }
    
    public void add(TreeNode root, ArrayList<Integer> list){
        if(root.left != null)
            add(root.left, list);
        list.add(root.val);
        if(root.right != null)
            add(root.right, list);
    }
}

// Code by Md Zaid Alam