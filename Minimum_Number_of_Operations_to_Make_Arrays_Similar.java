class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        ArrayList<Integer> en = new ArrayList<>(), et = new ArrayList<>();
        ArrayList<Integer> on = new ArrayList<>(), ot = new ArrayList<>();

        for (int i : nums) {
            if (i % 2 == 0) {
                en.add(i);
            } else {
                on.add(i);
            }
        }

        for (int i : target) {
            if (i % 2 == 0) {
                et.add(i);
            } else {
                ot.add(i);
            }
        }

        long ans = 0;
        Collections.sort(en);
        Collections.sort(et);
        Collections.sort(on);
        Collections.sort(ot);

        for (int i = 0; i < en.size(); i++) {
            ans += Math.abs(en.get(i) - et.get(i)) / 2;
        }

        for (int i = 0; i < on.size(); i++) {
            ans += Math.abs(on.get(i) - ot.get(i)) / 2;
        }
        return ans / 2;
    }
}

// Code by Md Zaid Alam