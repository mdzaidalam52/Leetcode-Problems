class Solution {
    public List<String> printVertically(String s) {
        String[] a = s.split("\\s+");
        int maxLength = 0;
        for(String str : a){
            maxLength = Math.max(maxLength, str.length());
        }
        
        StringBuilder[] ans = new StringBuilder[maxLength];
        
        for(int i = 0; i < maxLength; i++){
            ans[i] = new StringBuilder();
        }
        
        for(int i = 0; i < maxLength; i++){
            for(int j = 0; j < a.length; j++){
                if(i < a[j].length()){
                    ans[i].append(a[j].charAt(i));
                }else{
                    ans[i].append(" ");
                }
            }
        }
        
        for(int i = 0; i < ans.length; i++){
            while(ans[i].length() > 0 && ans[i].charAt(ans[i].length() - 1) == ' '){
                ans[i].deleteCharAt(ans[i].length() - 1);
            }
        }
        
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < ans.length; i++){
            list.add(ans[i].toString());
        }
        
        return list;
    }
}

// Code by Md Zaid Alam
