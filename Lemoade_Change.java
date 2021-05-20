class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] change = new int[3];
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                change[0]++;
            }else if(bills[i] == 10){
                if(change[0] > 0){
                    change[0]--;
                    change[1]++;
                }else{
                    return false;
                }
            }else{
                if(change[1] > 0){
                    if(change[0] > 0){
                        change[0]--;
                        change[1]--;
                    }else{
                        return false;
                    }
                }else if(change[0] > 2){
                    change[0] -= 3;
                }else{
                    return false;
                }
            }
        }
        
        return true;
    }
}

// Code by Md Zaid Alam