class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
        for(int a : salary){
            min = Math.min(min, a);
            max = Math.max(max, a);
            sum += a;
        }
        
        return (double)(sum - max - min)/ (salary.length - 2);
    }
}

// Code by Md Zaid Alam