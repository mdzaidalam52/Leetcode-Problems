class Solution {
    public int numSplits(String s) {
        int n = s.length();
        int[] a = new int[n];
        int[] b = new int[n];
        HashSet<Character> set = new HashSet<>(), setb = new HashSet<>();
        set.add(s.charAt(0));
        setb.add(s.charAt(n - 1));
        a[0] = 1;
        b[n-1] = 1;
        for(int i = 1; i < n; i++){
            if(!set.contains(s.charAt(i))){
            	set.add(s.charAt(i));
                a[i] = a[i-1]+ 1;
            }else{
                a[i] = a[i-1];
            }
            if(!setb.contains(s.charAt(n-1-i))){
            	setb.add(s.charAt(n-i-1));
                b[n - 1 - i] = b[n - i] + 1;
            }else{
                b[n-i-1] = b[n-i];
            }
        }
        
        int ans = 0;
        for(int i = 0; i < n - 1; i++){
            if(a[i] == b[i+1])
                ans++;
        }
        
        return ans;

    }
}

// Code by Md Zaid Alam