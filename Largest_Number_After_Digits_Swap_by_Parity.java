class Solution {
    public int largestInteger(int num) {
        ArrayList<Integer> e = new ArrayList<>(), o = new ArrayList<>();
        ArrayList<Integer> eind = new ArrayList<>(), oind = new ArrayList<>();
        int ind = 0;
        while(num != 0){
            int k = num % 10;
            if((k&1) == 0){
                e.add(k);
                eind.add(ind);
            }else{
                o.add(k);
                oind.add(ind);
            }
            ind++;
            num /= 10;
        }
        Collections.sort(e);
        Collections.sort(o);
        int ans = 0;
        for(int i = 0; i < eind.size(); i++){
            ans += ((int)Math.pow(10,eind.get(i)))*e.get(i);
        }
        for(int i = 0; i < oind.size(); i++){
            ans += ((int)Math.pow(10,oind.get(i)))*o.get(i);
        }
        return ans;
    }
}

// Code by Md Zaid Alam