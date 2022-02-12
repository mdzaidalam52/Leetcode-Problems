class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        if(!contains(wordList, endWord))
            return 0;
        if(check(beginWord, endWord))
            return 2;
        Queue<String> q = new LinkedList<>();
        int n = wordList.size();
        int dist[] = new int[n];
        boolean[] vis = new boolean[n];
        q.add(beginWord);
        int k = 0;
        while(!q.isEmpty()){
            k++;
            int t = q.size();
            while(t-- > 0){
                String str = q.remove();
                for(int i = 0; i < n; i++){
                    if(vis[i])
                        continue;
                    if(check(str, wordList.get(i))){
                        vis[i] = true;
                        dist[i] = k;
                        q.add(wordList.get(i));
                    }
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(vis[i] && check(endWord, wordList.get(i)) && dist[i] != 0){
                min = Math.min(min, dist[i]+2);
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
    
    boolean contains(List<String> list, String a){
        for(String str: list)
            if(str.equals(a))
                return true;
        return false;
    }
    
    boolean check(String a, String b){
        int k = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                k++;
                if(k > 1)
                    return false;
            }
        }
        return k == 1;
    }
}

// Code by Md Zaid Alam