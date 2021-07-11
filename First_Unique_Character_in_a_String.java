class Solution {
    public int firstUniqChar(String s) {
        int[] a = new int[26];
        Queue<Data> q = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            a[s.charAt(i) - 'a']++;
            if(a[s.charAt(i) - 'a'] == 1)
                q.add(new Data(i, s.charAt(i)));
        }
        
        while(!q.isEmpty()){
            if(a[q.peek().c - 'a'] == 1)
                return q.peek().ind;
            q.remove();
        }
        
        return -1;
    }
    class Data{
        int ind = 0;
        char c = ' ';
        Data(int i, char c){
            ind = i;
            this.c = c;
        }
    }
}

// Code by Md Zaid Alam