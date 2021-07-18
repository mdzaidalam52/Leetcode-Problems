class Solution {
    public int numUniqueEmails(String[] emails) {
        HashMap<String, HashSet<String>> map = new HashMap<>();
        for(int i = 0; i < emails.length; i++){
            String l = local(emails[i]);
            String d = domain(emails[i]);
            if(map.containsKey(l)){
                map.get(l).add(d);
            }else{
                map.put(l, new HashSet<>());
                map.get(l).add(d);
            }
        }
        int ans = 0;
        for(String s : map.keySet()){
            ans += map.get(s).size();
        }
        return ans;
    }
    
    public String local(String l){
        StringBuilder str = new StringBuilder();
        for(char c : l.toCharArray()){
            if(c == '+' || c == '@')
                break;
            if(c == '.')
                continue;
            str.append(c);
        }
        return str.toString();
    }
    
    public String domain(String d){
        return d.substring(d.indexOf("@") + 1, d.length());
    }
}

// Code by Md Zaid Alam