class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        StringBuilder str = new StringBuilder("");
        solve(str, list, 0, digits);
        return list;
    }
    
    void solve(StringBuilder str, List<String> list, int ind, String digits){
        if(ind == digits.length()){
            if(!str.toString().equals(""))
            list.add(str.toString());
            return;
        }
        char[] a = values(digits.charAt(ind));
        
        for(char c : a){
            str.append(c);
            solve(str, list, ind+1, digits);
            str.deleteCharAt(str.length()-1);
            
        }
    }
    
    char[] values(char a){
        if(a == '2'){
            char[] c = {'a', 'b', 'c'};
            return c;
        }else if(a == '3'){
            char[] c = {'d', 'e', 'f'};
            return c;
        }else if(a == '4'){
            char[] c = {'g', 'h', 'i'};
            return c;
        }else if(a == '5'){
            char[] c = {'j', 'k', 'l'};
            return c;
        }else if(a == '6'){
            char[] c = {'m', 'n', 'o'};
            return c;
        }else if(a == '7'){
            char[] c = {'p', 'q', 'r', 's'};
            return c;
        }else if(a == '8'){
            char[] c = {'t', 'u', 'v'};
            return c;
        }else{
            char[] c = {'w', 'x', 'y', 'z'};
            return c;
        }
    }
}

// Code by Md Zaid Alam