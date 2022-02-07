/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> q1 = new LinkedList<>(), q2 = new LinkedList<>();
        q1.add(original);
        q2.add(cloned);
        while(!q1.isEmpty()){
            TreeNode t1 = q1.remove();
            TreeNode t2 = q2.remove();
            if(t1 == target){
                return t2;
            }
            if(t1.left != null){
                q1.add(t1.left);
                q2.add(t2.left);
            }
            if(t1.right != null){
                q1.add(t1.right);
                q2.add(t2.right);
            }
        }
        return null;
    }
}

// Code by Md Zaid Alam