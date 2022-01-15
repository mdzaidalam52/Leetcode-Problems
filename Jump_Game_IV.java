class Solution {
    public int minJumps(int[] arr) {
        if(arr.length == 1)
			return 0;
        int n = arr.length;
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.get(arr[i]).add(i);
            }else{
                ArrayList<Integer> a = new ArrayList<>();
                map.put(arr[i], a);
                map.get(arr[i]).add(i);
            }
        }
                
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        int ans = 0;
        q.add(0);
        
        while(q.size() != 0) {
        	ans++;
        	int k = q.size();
        	while(k-- > 0) {
        		int ind = q.remove();
        		if(ind - 1 >= 0 && map.containsKey(arr[ind - 1]))
        			q.add(ind - 1);
        		
        		if(ind+1 < n && map.containsKey(arr[ind + 1]))
        			if(ind + 1 == n-1)
        				return ans;
        			else
        				q.add(ind+1);
        		
        		if(map.containsKey(arr[ind])){ 
                    for(int a : map.get(arr[ind])){
                        if(a != ind){ 
                            if(a == n - 1) return ans;
                            q.offer(a);
                        }
                    }
                }
                map.remove(arr[ind]);
        	}
        }
        return ans;
    }
}

// Code by Md Zaid Alam