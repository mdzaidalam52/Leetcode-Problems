class Solution {
    public String[] reorderLogFiles(String[] logs) {
        ArrayList<String> let = new ArrayList<>();
        ArrayList<String> dig = new ArrayList<>();
        
        for(String str: logs){
            if(digit(str)){
                dig.add(str);
            }else{
                let.add(str);
            }
        }
        
        Collections.sort(let, (a, b) -> {
            int ai = 0;
            int bi = 0;
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) == ' '){
                    ai = i;
                    break;
                }
            }
            for(int i = 0; i < b.length(); i++){
                if(b.charAt(i) == ' '){
                    bi = i;
                    break;
                }
            }
            if(a.substring(ai+1).equals(b.substring(bi+1))){
                return a.substring(0, ai).compareTo(b.substring(0, bi));
            }
            return a.substring(ai+1).compareTo(b.substring(bi+1));
        });
        String[] ans = new String[logs.length];
        int i = 0;
        for(String str: let){
            ans[i++] = str;
        }
        for(String str: dig){
            ans[i++] = str;
        }
        return ans;
    }
    
    boolean digit(String str){
        int i = 0;
        for(i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                i++;
                break;
            }
        }
        return str.charAt(i) >= '0' && str.charAt(i) <= '9';
    }
}

// Code by Md Zaid Alam