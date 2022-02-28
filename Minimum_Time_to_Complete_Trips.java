class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long min = Long.MAX_VALUE;
        for (int i : time)
            min = Math.min(min, i);

        long s = 1, e = (long) totalTrips * min;
        while (s < e) {
            long mid = (s + e) / 2;
            long k = check(time, mid);
            if (k >= totalTrips) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    long check(int[] time, long t) {
        long trips = 0;
        for (int i : time) {
            trips += t / i;
        }
        return trips;
    }
}

// Code by Md Zaid Alam