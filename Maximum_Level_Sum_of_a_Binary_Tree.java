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
    public int maxLevelSum(TreeNode root) {
        long max = Long.MIN_VALUE, curr = 0;
        int maxLevel = 0, k = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            k++;
            int size = q.size();
            while(size-- > 0){
                TreeNode n = q.remove();
                if(n.left != null)
                    q.add(n.left);
                if(n.right != null)
                    q.add(n.right);
                curr += n.val;
            }
            if(curr > max){
                max = curr;
                maxLevel = k;
            }
            curr = 0;
        }
        return maxLevel;
    }
}

// Code by Md Zaid Alam