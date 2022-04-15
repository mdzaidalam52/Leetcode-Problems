class Solution {
    public String minimizeResult(String expression) {
        int ind = 0;
        for(int i = 0; i < expression.length(); i++){
            if(expression.charAt(i) == '+'){
                ind = i;
                break;
            }
        }
        int ia = 0, ja = 0;
        long ans = Long.MAX_VALUE;
        for(int i = 0; i < ind; i++){
            long k = i == 0 ? 1 : Long.parseLong(expression.substring(0, i));
            long l = Long.parseLong(expression.substring(i, ind));
            for(int j = ind+1; j < expression.length(); j++){
                long m = Long.parseLong(expression.substring(ind+1, j+1));
                long n = j == expression.length() - 1 ? 1: Long.parseLong(expression.substring(j+1, expression.length()));
                if(ans > k*(l+m)*n){
                    ans = k*(l+m)*n;
                    ia = i;
                    ja = j;
                }
            }
        }
        StringBuilder str = new StringBuilder(expression);
        str.insert(ja+1, ')');
        str.insert(ia, '(');
        return str.toString();
        
    }
}

// Code by Md Zaid Alam