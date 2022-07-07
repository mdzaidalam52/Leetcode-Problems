class Solution {
    public String decodeMessage(String key, String message) {
        char ch = 'a';
        HashMap<Character, Character> map = new HashMap<>();
        for(char c: key.toCharArray()){
            if(c == ' ')
                continue;
            if(!map.containsKey(c)){
                map.put(c, ch);
                ch = (char)(ch + 1);
                if(ch > 'z'){
                    break;
                }
            }
        }
        StringBuilder str = new StringBuilder();
        for(char c: message.toCharArray()){
            if(c == ' ')
                str.append(' ');
            else{
                str.append(map.get(c));
            }
        }
        return str.toString();
    }
}

// Code by Md Zaid Alam