class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int s = 0, e = n - 1, ans = 0;
        while (s <= e) {
            if (s == e) {
                s++;
            } else if (people[s] + people[e] <= limit) {
                s++;
                e--;
            } else {
                e--;
            }
            ans++;
        }
        return ans;
    }
}

// Code by Md Zaid Alam