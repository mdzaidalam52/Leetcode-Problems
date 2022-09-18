class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int[] vec = new int[366];
        int m1 = Integer.valueOf(arriveAlice.substring(0, 2))-1;
        int d1 = 0;
        for (int i = 0; i<m1; i++)
            d1+=days[i];
        d1+=Integer.valueOf(arriveAlice.substring(3, 5));
        m1 =Integer.valueOf(leaveAlice.substring(0, 2))-1;
        int d2 = 0;
        for (int i = 0; i<m1; i++)
            d2+=days[i];
        d2+=Integer.valueOf(leaveAlice.substring(3, 5));
        for (int i = d1; i<=d2; i++) vec[i]++;
        m1 = Integer.valueOf(arriveBob.substring(0, 2))-1;
        d1 = 0;
        for (int i = 0; i<m1; i++)
            d1+=days[i];
        d1+=Integer.valueOf(arriveBob.substring(3, 5));
        m1 =Integer.valueOf(leaveBob.substring(0, 2))-1;
        d2 = 0;
        for (int i = 0; i<m1; i++)
            d2+=days[i];
        d2+=Integer.valueOf(leaveBob.substring(3, 5));
        for (int i = d1; i<=d2; i++) vec[i]++;
        int ans = 0;
        for(int i = 0; i < 366; i++){
            if(vec[i] == 2)
                ans++;
        }
        return ans;
    }
    
}

// Code by Md Zaid Alam