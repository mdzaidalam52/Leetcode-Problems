class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int key = 0;
        switch(ruleKey){
            case "type":
                key = 0;
                break;
            case "color":
                key = 1;
                break;
            case "name":
                key = 2;
                break;
        }
        int ans = 0;
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).get(key).equals(ruleValue))
                ans++;
        }
        return ans;
    }
}

// Code by Md Zaid Alam