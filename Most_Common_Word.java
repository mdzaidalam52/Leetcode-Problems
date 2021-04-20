class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> ban = new HashSet<>();
        for(String s : banned)
            ban.add(s);
        
        HashMap<String, Integer> map = new HashMap<>();
        
        String[] str = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ");
        for(String s : str){
            if(!ban.contains(s) && !s.equals("")){
                map.put(s, map.getOrDefault(s, 0)+1);
            }
        }
        int max = 0;
        String ans = "";
        for(String s : map.keySet()){
            if(map.get(s) > max){
                ans = s;
                max = map.get(s);
            }
        }
        
        return ans;
    }
}

// Code by Md Zaid Alam