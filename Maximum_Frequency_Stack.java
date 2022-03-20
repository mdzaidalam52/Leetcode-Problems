class FreqStack {
    HashMap<Integer, Integer> freq;
    HashMap<Integer, Stack<Integer>> map;
    int max;

    public FreqStack() {
        freq = new HashMap<>();
        map = new HashMap<>();
        max = 0;
    }

    public void push(int val) {
        int f = freq.getOrDefault(val, 0) + 1;
        if (!map.containsKey(f)) {
            map.put(f, new Stack<>());
        }
        freq.put(val, f);
        map.get(f).push(val);
        max = Math.max(max, f);
    }

    public int pop() {
        int ans = map.get(max).pop();
        freq.put(ans, freq.get(ans) - 1);
        if (map.get(max).size() == 0)
            max--;

        return ans;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */

// Code by Md Zaid Alam