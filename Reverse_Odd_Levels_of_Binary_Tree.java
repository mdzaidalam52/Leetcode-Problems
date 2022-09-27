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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth = 0;
        while(!q.isEmpty()){
            int k = q.size();
            Stack<Integer> st = new Stack<>();
            Queue<TreeNode> l = new LinkedList<>();
            while(k-- > 0){
                TreeNode node = q.remove();
                l.add(node);
                st.push(node.val);
                if(node.left != null){
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if(depth%2 == 1){
                while(!l.isEmpty()){
                    l.remove().val = st.pop();
                }
            }
            depth++;
        }
        return root;
    }
}

// Code by Md Zaid Alam