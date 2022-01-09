class Solution {
    public boolean isRobotBounded(String instructions) {
        int i = 0;
        int x = 0, y = 0;
        boolean bool = false;
        for(char c: instructions.toCharArray()){
            if(c == 'L'){
                i = (i+1)%4;
            }else if(c == 'R'){
                i = (i+3)%4;
            }else{
                bool = true;
                switch(i) {
                case 0:
                	x++;
                	break;
                case 1:
                	y++;
                	break;
                case 2:
                	x--;
                	break;
                case 3:
                	y--;
                	break;
                }
            }
        }
        return i != 0 || !bool || (x == y && x == 0);
    }
}

// Code by Md Zaid Alam