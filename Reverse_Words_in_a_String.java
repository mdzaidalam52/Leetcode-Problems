class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ' && str.length() > 0){
                arr.add(str.toString());
                str = new StringBuilder();
            }else if(s.charAt(i) != ' '){
                str.append(s.charAt(i));
            }
        }
        if(str.length() > 0){
            arr.add(str.toString());
            str = new StringBuilder();
        }
        if(arr.size() > 0){
            str.append(arr.get(arr.size() - 1));
        }
        for(int i = arr.size() - 2; i >= 0; i--){
            str.append(" " + arr.get(i));
        }
        return str.toString();
    }
}

// Code by Md Zaid Alam