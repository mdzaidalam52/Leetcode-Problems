class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> a = new HashMap<>();
        HashMap<Character, Character> b = new HashMap<>();
        
        if(s.length() != t.length())
            return false;
        
        for(int i = 0; i < s.length(); i++){
            if(!a.containsKey(s.charAt(i))){
                if(!b.containsKey(t.charAt(i))){
                    a.put(s.charAt(i), t.charAt(i));
                    b.put(t.charAt(i), s.charAt(i));
                }else
                    return false;
            }else if(!b.containsKey(t.charAt(i))){
                return false;
            }else if(a.get(s.charAt(i)) != t.charAt(i) || b.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}

// Code by Md Zaid Alam