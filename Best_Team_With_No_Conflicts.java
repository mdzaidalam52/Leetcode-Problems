class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;
        ArrayList<Data> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new Data(scores[i], ages[i]));
        }
        Collections.sort(arr, (a, b) -> {
            if(a.a != b.a)
                return a.a - b.a;
            return a.s - b.s;
        });
        int max = arr.get(0).s;
        int[] ans = new int[n];
        ans[0] = arr.get(0).s;
        for(int i = 1; i < n; i++){
            ans[i] = arr.get(i).s;
            for(int j = 0; j < i; j++){
                if(arr.get(i).a == arr.get(j).a){
                    ans[i] = Math.max(ans[j]+arr.get(i).s, ans[i]);
                }else if(arr.get(i).s >= arr.get(j).s){
                    ans[i] = Math.max(ans[j]+arr.get(i).s, ans[i]);
                }
            }
            max = Math.max(ans[i], max);
        }
        return max;
    }
    
    class Data{
        int a, s;
        Data(int s, int a){
            this.s = s;
            this.a = a;
        }
    }
}

// Code by Md Zaid Alam