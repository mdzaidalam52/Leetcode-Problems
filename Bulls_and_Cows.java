class Solution {
    public String getHint(String secret, String guess) {
        int b = 0, c = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < secret.length(); i++){
            map.put(secret.charAt(i), map.getOrDefault(secret.charAt(i), 0) + 1);
        }
        boolean[] v = new boolean[guess.length()];
        char ch;
        for(int i = 0; i < guess.length(); i++){
            if(guess.charAt(i) == secret.charAt(i)){
                ch = guess.charAt(i);
                b++;
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0)
                    map.remove(ch);
                v[i] = true;
            }
        }
        
        for(int i = 0; i < guess.length(); i++){
            if(v[i])
                continue;
            ch = guess.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch) == 1)
                    map.remove(ch);
                else
                    map.put(ch, map.get(ch) - 1);
                c++;
            }
        }
        return b + "A" + c + "B";
    }
}

// Code by Md Zaid Alam