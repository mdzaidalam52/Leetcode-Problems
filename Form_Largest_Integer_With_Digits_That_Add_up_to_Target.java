class Solution {
    public String largestNumber(int[] cost, int target) {
		StringBuilder str;
		StringBuilder[] a = new StringBuilder[target+1];
		a[0] = new StringBuilder("");
		
		for(int i = 1; i <= target; i++) {
			for(int j = 8; j >= 0; j--) {
				if(cost[j] <= i && a[i - cost[j]] != null) {
					str = new StringBuilder(a[i-cost[j]]);
					str.append(Integer.toString(j+1));
					if(a[i] == null || str.length() > a[i].length()) 
						a[i] = str;
				}
			}
		}
		
		if(a[target] != null)
			return a[target].reverse().toString();
		
		return "0";
	}

}

// Code by Md Zaid Alam