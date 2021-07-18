class Solution {
    public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		ans.add(new LinkedList<>());
		for (int i = 0; i < nums.length; i++) {
			List<Integer> a = new LinkedList<>();
			a.add(nums[i]);
			solve(nums, i + 1, ans, a);
			a.remove(0);
		}
		return ans;
	}

	public void solve(int[] nums, int ind, List<List<Integer>> ans, List<Integer> a) {
		if (ind == nums.length) {
			List<Integer> k = new LinkedList<>();
			k.addAll(a);
			ans.add(k);
			return;
		}
		solve(nums, ind + 1, ans, a);
		a.add(nums[ind]);
		solve(nums, ind + 1, ans, a);
		a.remove(a.size() - 1);

	}
}

// Code by Md Zaid Alam