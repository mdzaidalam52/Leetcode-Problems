class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
		boolean[] vis = new boolean[n];
		
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		vis[start] = true;
		
		while(!q.isEmpty()) {
			int k = q.size();
			while(k-- > 0) {
				int ind = q.remove();
				if(arr[ind] == 0)
					return true;
				if(ind - arr[ind] >= 0 && !vis[ind-arr[ind]]) {
					vis[ind-arr[ind]] = true;
					q.add(ind-arr[ind]);
				}
				if(ind + arr[ind] < n && !vis[ind+arr[ind]]) {
					vis[ind+arr[ind]] = true;
					q.add(ind+arr[ind]);
				}
			}
		}
		return false;
    }
}

// Code by Md Zaid Alam