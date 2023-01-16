class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int i = 0, n = intervals.length;
        while (i < n && intervals[i][1] < newInterval[0])
            ans.add(intervals[i++]);
        while (i < n && intervals[i][0] <= newInterval[1])
            newInterval = new int[] { Math.min(intervals[i][0], newInterval[0]),
                    Math.max(intervals[i++][1], newInterval[1]) };
        ans.add(newInterval);
        while (i < n)
            ans.add(intervals[i++]);
        return ans.toArray(new int[ans.size()][2]);
    }
}

// Code by Md Zaid Alam