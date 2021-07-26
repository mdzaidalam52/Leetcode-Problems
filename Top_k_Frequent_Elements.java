class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        ArrayList<Data> ans = new ArrayList<>();
        for(int key : map.keySet()){
            ans.add(new Data(key, map.get(key)));
        }
        
        Collections.sort(ans, new compare());
        
        int[] a = new int[k];
        for(int i = 0; i < k; i++){
            a[i] = ans.get(i).i;
        }
        return a;
    }
}

class Data{
    int i, v;
    Data(int i, int v){
        this.i = i;
        this.v = v;
    }
}

class compare implements Comparator<Data> {

	@Override
	public int compare(Data o1, Data o2) {
		return o2.v - o1.v;
	}

}

// Code by Md Zaid Alam