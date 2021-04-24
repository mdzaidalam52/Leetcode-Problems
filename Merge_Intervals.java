class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>> li = new ArrayList<>();
        for(int[] a : intervals){
            li.add(new ArrayList<>());
            for(int i : a){
                li.get(li.size() - 1).add(i);
            }
        }
        
        Collections.sort(li, new com());
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int s = li.get(0).get(0), e = li.get(0).get(1);
        
        for(int i = 1; i < li.size(); i++){
            if(li.get(i).get(0) <= e){
                e = Math.max(e, li.get(i).get(1));
            }else{
                ans.add(new ArrayList<>());
                ans.get(ans.size() - 1).add(s);
                ans.get(ans.size() - 1).add(e);
                s = li.get(i).get(0);
                e = li.get(i).get(1);
            }
        }
        if(ans.size() == 0 || ans.get(ans.size() - 1).get(1) != e){
            ans.add(new ArrayList<>());
            ans.get(ans.size() - 1).add(s);
            ans.get(ans.size() - 1).add(e);
        }
        int[][] a = new int[ans.size()][2];
        for(int i = 0; i < a.length; i++){
            a[i][0] = ans.get(i).get(0);
            a[i][1] = ans.get(i).get(1);
        }
        return a;
    }
    
}

class com implements Comparator<ArrayList<Integer>>{
    public int compare(ArrayList<Integer> a, ArrayList<Integer> b){
        if(a.get(0) != b.get(0)){
            return a.get(0)-b.get(0);
        }else{
            return a.get(1) - b.get(1);
        }
    }
}

// Code by Md Zaid Alam