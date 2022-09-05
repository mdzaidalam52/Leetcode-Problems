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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        int min = 0, max = 0;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        Queue<Data> q = new LinkedList<>();
        q.add(new Data(0, root));
        while(!q.isEmpty()){
            int size = q.size();
            List<Data> l = new ArrayList<>();
            while(size-- > 0){
                int ind = q.peek().ind;
                min = Math.min(min, ind);
                max = Math.max(max, ind);
                TreeNode node = q.remove().root;
                if(node.left != null){
                    q.add(new Data(ind-1, node.left));
                }
                if(node.right != null){
                    q.add(new Data(ind+1, node.right));
                }
                l.add(new Data(ind, node));
            }
            Collections.sort(l, (a, b)-> {
                if(a.ind != b.ind)
                    return a.ind-b.ind;
                return a.root.val - b.root.val;
            });
            for(Data d: l){
                if(!map.containsKey(d.ind)){
                    map.put(d.ind, new ArrayList<>());
                }
                map.get(d.ind).add(d.root.val);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = min; i <= max; i++){
            ans.add(new ArrayList<>());
            for(int k: map.get(i)){
                ans.get(i-min).add(k);
            }
        }
        return ans;
    }
    class Data{
        int ind;
        TreeNode root;
        Data(int ind, TreeNode root){
            this.ind = ind;
            this.root = root;
        }
    }
}

// Code by Md Zaid Alam