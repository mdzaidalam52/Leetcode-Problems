/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i <= 1000; i++){
            int s = 1, e = 1000;
            while(s < e){
                int mid = (s+e)/2;
                int k = customfunction.f(i, mid);
                if(k == z){
                    List<Integer> l = new ArrayList<>();
                    l.add(i);
                    l.add(mid);
                    ans.add(l);
                    break;
                }else if(k > z){
                    e = mid;
                }else{
                    s = mid+1;
                }
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam