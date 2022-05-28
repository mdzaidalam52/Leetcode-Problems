class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        String ans = senders[0];
        for(int i = 0; i < senders.length; i++){
            map.put(senders[i], map.getOrDefault(senders[i], 0) + length(messages[i]));
            if(map.get(senders[i]) > max){
                max = map.get(senders[i]);
                ans = senders[i];
            }else if(map.get(senders[i]) == max){
                if(senders[i].compareTo(ans) > 0){
                    ans = senders[i];
                }
            }
        }
        return ans;
        
    }
    
    int length(String str){
        int ans = 1;
        char prev = ' ';
        str = str.trim();
        for(char c: str.toCharArray()){
            if(c == ' ' && prev != ' '){
                ans++;
            }
            prev = c;
        }
        return ans;
    }
}

// Code by Md Zaid Alam