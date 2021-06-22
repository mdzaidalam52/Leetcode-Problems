class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] str = s.split(" ");
        HashSet<String> set = new HashSet<>();
        if(pattern.length() != str.length){
            return false;
        }
        
        for(int i = 0; i < pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(str[i])){
                    return false;
                }
            }else{
                if(set.contains(str[i]))
                    return false;
                map.put(pattern.charAt(i), str[i]);
                set.add(str[i]);
            }
        }
        
        return true;
    }
}

// Code by Md Zaid Alam