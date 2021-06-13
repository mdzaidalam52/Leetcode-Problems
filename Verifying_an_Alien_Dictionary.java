class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < 26; i++)
            map.put(order.charAt(i), i);
        
        boolean bool;
        for(int i = 0; i < words.length - 1; i++){
            bool = false;
            for(int j = 0; j < Math.min(words[i].length(), words[i+1].length()); j++){
                if(map.get(words[i].charAt(j)) > map.get(words[i+1].charAt(j))){
                    return false;
                }else if(map.get(words[i].charAt(j)) < map.get(words[i+1].charAt(j))){
                    bool = true;
                    break;
                }                                
            }
            if(bool)
                continue;
                
            if(words[i].length() > words[i+1].length())
                return false;
        }
        
        return true;
    }
}

// Code by Md Zaid Alam