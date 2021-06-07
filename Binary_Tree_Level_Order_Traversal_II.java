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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> a = new ArrayList<>();
        if(root == null)
            return a;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int k = 1;
        int l = 1;
        TreeNode t;
        while(!q.isEmpty()){
            l = k;
            k = 0;
            a.add(new ArrayList<>());
            while(l-- > 0){
                t = q.remove();
                if(t.left != null){
                    q.add(t.left);
                    k++;
                }
                if(t.right != null){
                    q.add(t.right);
                    k++;
                }
                a.get(a.size() - 1).add(t.val);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = a.size() - 1; i >= 0; i--){
            ans.add(a.get(i));
        }
        return ans;
    }
}

// Code by Md Zaid Alam