class Solution {
    public boolean checkIfExist(int[] arr) {
        int z = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
            if(i == 0)
                z++;
        }
        if(z >= 2)
            return true;
        for(int i : arr){
        	if(i == 0)
        		continue;
            if(set.contains(i*2))
                return true;
        }
        return false;
    }
}

// Code by Md Zaid Alam