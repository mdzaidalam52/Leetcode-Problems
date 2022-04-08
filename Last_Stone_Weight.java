class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i : stones)
            pq.add(i);
        while (pq.size() > 1) {
            int a = pq.remove();
            int b = pq.remove();
            pq.add(a - b);
        }
        return pq.remove();
    }
}

// Code by Md Zaid Alam