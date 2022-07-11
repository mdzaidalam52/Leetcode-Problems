class Solution {
    public boolean canChange(String start, String target) {
        if(start.length() != target.length())
            return false;
        int d = 0;
        ArrayList<Integer> d1 = new ArrayList<>();
        ArrayList<Integer> d2 = new ArrayList<>();
        ArrayList<Character> c1 = new ArrayList<>();
        ArrayList<Character> c2 = new ArrayList<>();
        for(int i = 0; i < start.length(); i++){
            if(start.charAt(i) == '_'){
                d++;
            }else{
                c1.add(start.charAt(i));
                d1.add(d);
                d = 0;
            }
        }
        d1.add(d);
        d = 0;
        for(int i = 0; i < start.length(); i++){
            if(target.charAt(i) == '_'){
                d++;
            }else{
                c2.add(target.charAt(i));
                d2.add(d);
                d = 0;
            }
        }
        d2.add(d);
        if(d1.size() != d2.size())
            return false;
        
        for(int i = 0; i < d1.size() - 1; i++){
            if(c1.get(i) != c2.get(i))
                return false;
            if(d1.get(i) > d2.get(i)){
                if(c1.get(i) != 'L')
                    return false;
                d1.set(i+1, d1.get(i+1) + d1.get(i) - d2.get(i));
                
            }else if(d1.get(i) < d2.get(i)){
                int k = d2.get(i) - d1.get(i);
                int ind = i+1;
                while(ind < d1.size() && k > 0){
                    if(c1.get(ind - 1) != 'R')
                        return false;
                    if(k > d1.get(ind)){
                        k -= d1.get(ind);
                        d1.set(ind, 0);
                    }else{
                        d1.set(ind, d1.get(ind) - k);
                        k = 0;
                    }
                    ind++;
                }   
            }
        }
        return true;
        
    }
}


// Code by Md Zaid Alam