class Solution {
    public int[][] outerTrees(int[][] trees) {
        Arrays.sort(trees, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1]-b[1]);
        Stack<int[]> upper = new Stack<>();
        Stack<int[]> lower = new Stack<>();
        for(int i = 0; i < trees.length; i++){
            while(upper.size() >= 2 && check(upper.get(upper.size()-2), upper.get(upper.size()-1), trees[i]) > 0){
                upper.pop();
            }

            while(lower.size() >= 2 && check(lower.get(lower.size()-2), lower.get(lower.size()-1), trees[i]) < 0){
                lower.pop();
            }

            upper.push(trees[i]);
            lower.push(trees[i]);
        }
        HashSet<int[]> set = new HashSet<>(upper);
        set.addAll(lower);
        return set.toArray(new int[set.size()][]);
    }

    int check(int[] p,int[] q,int[] r){
        return (r[1]-q[1]) * (q[0]-p[0]) - ( (q[1]-p[1]) * (r[0]-q[0])); 
    }
}

// Code by Md Zaid Alam