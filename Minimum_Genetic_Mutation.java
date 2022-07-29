class Solution {
    public int minMutation(String start, String end, String[] bank) {
        if(start.equals(end)){
            return 0;
        }
        Queue<String> q = new LinkedList<>();
        q.add(start);
        boolean[] vis = new boolean[bank.length];
        int k = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                String str = q.remove();
                if(str.equals(end)){
                    return k;
                }
                for(int i = 0; i < bank.length; i++){
                    if(!vis[i] && check(str, bank[i])){
                        q.add(bank[i]);
                        vis[i] = true;
                    }
                }
            }
            k++;
        }
        return -1;
    }
    
    public boolean check(String a, String b){
        boolean changed = false;
        for(int i = 0; i < 8; i++){
            if(a.charAt(i) != b.charAt(i)){
                if(changed)
                    return false;
                else
                    changed = true;
            }
        }
        return true;
    }
}

// Code by Md Zaid Alam