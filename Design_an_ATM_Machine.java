class ATM {
    long[] num;
    int[] val;
    public ATM() {
        num = new long[5];
        val = new int[]{20, 50, 100, 200, 500};
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i = 0; i < 5; i++)
            num[i] += banknotesCount[i];
    }
    
    public int[] withdraw(int amount) {
        int[] ans = new int[5];
        for(int i = 4; i >= 0; i--){
            int k = amount/val[i];
            amount -= (int)Math.min(k, num[i])*val[i];
            ans[i] = (int)Math.min(k, num[i]);
            num[i] -= Math.min(k, num[i]);
        }
        if(amount == 0)
            return ans;
        for(int i = 0; i < 5; i++)
            num[i] += ans[i];
        return new int[]{-1};
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */

 // Code by Md Zaid Alam