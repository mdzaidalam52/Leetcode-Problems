class Solution {
    public String convertToBase7(int num) {
        if(num == 0)
            return "0";
        boolean bool = false;
        if(num < 0)
            bool = true;
        num = Math.abs(num);
        LinkedList<Integer> ll = new LinkedList<>();
        while(num != 0){
            ll.add(0, num%7);
            num = num/7;
        }
        StringBuilder str = new StringBuilder();
        if(bool)
            str.append("-");
        for(int val : ll){
            str.append(Integer.toString(val));
        }
        return str.toString();
    }
}

// Code by Md Zaid Alam