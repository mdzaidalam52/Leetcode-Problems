class Solution {
    public double averageWaitingTime(int[][] customers) {
        double ans = customers[0][1];
        int a = customers[0][0] + customers[0][1];
        for(int i = 1; i < customers.length; i++){
            if(a <= customers[i][0]){
                a = customers[i][0] + customers[i][1];
                ans += customers[i][1];
            }else{
                ans += a - customers[i][0];
                a += customers[i][1];
                ans += customers[i][1];
                
            }
        }
        return ans/customers.length;
    }
}

// Code by Md Zaid Alam