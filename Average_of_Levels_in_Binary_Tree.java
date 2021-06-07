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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        double sum = 0, size = 0;;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int l = 1, k = 0;
        TreeNode t;
        while(!q.isEmpty()){
            size = q.size();
            while(l-- > 0){
                t = q.remove();
                if(t.left != null){
                    k++;
                    q.add(t.left);
                }
                if(t.right != null){
                    k++;
                    q.add(t.right);
                }
                sum += t.val;
            }
            ans.add(sum/size);
            sum = 0;
            l = k;
            k = 0;
        }
        return ans;
    }
}