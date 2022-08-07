class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        if(tasks.length == 0)
            return 0;
        HashMap<Integer, Long> map = new HashMap<>();
        long ans = 0, n = tasks.length;
        for(int i = 0; i < n; i++){
            if(map.containsKey(tasks[i]))
                ans = Math.max(map.get(tasks[i]) + space + 1, ans+1);
            else
                ans++;
            map.put(tasks[i], ans);
        }
        return ans;
    }
}

// Code by Md Zaid Alam