class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            q.add(i);
        }
        int[] ans = new int[n];
        int ind = 0;
        while (!q.isEmpty()) {
            int k = q.remove();
            ans[k] = deck[ind];
            if (!q.isEmpty()) {
                q.add(q.remove());
            }
            ind++;
        }
        return ans;
    }
}

// Code by Md Zaid Alam