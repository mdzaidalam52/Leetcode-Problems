class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1; i < 10; i++){
            fill(n-1, k, ans, i);
        }
        int[] a = new int[ans.size()];
        for(int i = 0; i < a.length; i++)
            a[i] = ans.get(i);
        return a;
    }
    
    void fill(int n, int k, ArrayList<Integer> ans, int a){
        if(n == 0){
            ans.add(a);
            return;
        }
        int l = a%10 - k;
        if(l >= 0)
            fill(n - 1, k, ans, a*10 + l);
        if(k == 0)
            return;
        l = a%10 + k;
        if(l < 10)
            fill(n - 1, k, ans, a*10 + l);
    }
}

// Code by Md Zaid Alam