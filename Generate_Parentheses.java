class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        answer(new StringBuilder("("), n-1, n, list);
        return list;
    }
    
    void answer(StringBuilder str , int o, int c, List<String> list){
        if(o == 0){
            for(int i = 0; i < c; i++){
                str.append(')');
            }
            list.add(str.toString());
            str.delete(str.length() - c, str.length());
            return;
        }
        str.append('(');
        answer(str, o - 1, c, list);
        str.deleteCharAt(str.length() - 1);
        if(o < c){
            str.append(')');
            answer(str, o, c - 1, list);
            str.deleteCharAt(str.length()-1);
        }
    }
}

// Code by Md Zaid Alam