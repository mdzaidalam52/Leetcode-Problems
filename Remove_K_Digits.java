class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < n; i++){
        	if(k <= 0) {
        		for(; i < n; i++)
        			st.push(num.charAt(i));
        	}else if(st.isEmpty()) {
            	if(num.charAt(i) == '0')
            		continue;
            	else
            		st.push(num.charAt(i));
            }else if(num.charAt(i) == '0') {
            	while(!st.isEmpty() && k > 0) {
            		st.pop();
            		k--;
            	}
                
            	if(!st.isEmpty()) {
            		st.push('0');
            	}
            }else {
            	while(k > 0 && !st.isEmpty() && st.peek() > num.charAt(i)) {
            		st.pop();
            		k--;
            	}
            	st.push(num.charAt(i));
            }
        }
        
        String ans = convert(st);
        if(k > 0) {
        	if(ans.length() - k > 0)
        		return ans.substring(0, ans.length() - k);
        	else
        		return "0";
        }else {
        	return ans;
        }
    }
	
	String convert(Stack<Character> st) {
		StringBuilder ans = new StringBuilder();
		
		while(!st.isEmpty()) {
				ans.append(st.pop());
		}
		ans = ans.reverse();
		while(ans.length() > 1 && ans.charAt(0) == '0')
			ans.deleteCharAt(0);
		return ans.length() > 0 ? ans.toString() : "0";
	}
}

// Code by Md Zaid Alam