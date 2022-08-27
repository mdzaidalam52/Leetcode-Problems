class Solution {
    public int numberOfRounds(String loginTime, String logoutTime) {
        int login = Integer.parseInt(loginTime.substring(0, 2)) * 60 + Integer.parseInt(loginTime.substring(3));
        int logout = Integer.parseInt(logoutTime.substring(0, 2)) * 60 + Integer.parseInt(logoutTime.substring(3));
        if(login > logout){
            logout += 60*24;
        }
        login = login(login);
        logout = logout(logout);
        return Math.max(logout - login, 0);
    }
    
    int login(int t){
        if(t%15 == 0)
            return t/15;
        return (t/15)+1;
    }
    
    int logout(int t){
        return t/15;
    }
}

// Code by Md Zaid Alam