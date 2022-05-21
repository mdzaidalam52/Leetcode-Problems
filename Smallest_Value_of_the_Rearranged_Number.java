class Solution {
    public long smallestNumber(long num) {
        if (num == 0)
            return num;
        boolean pos = num >= 0;
        num = Math.abs(num);
        int[] a = new int[10];
        int min = 10;
        while (num > 0) {
            a[(int) (num % 10)]++;
            if (num % 10 != 0)
                min = Math.min((int) (num % 10), min);
            num /= 10;
        }
        long ans = 0;
        if (pos) {
            ans += min;
            a[min]--;
            for (int i = 0; i < 10; i++) {
                while (a[i]-- > 0)
                    ans = ans * 10 + i;
            }
        } else {
            for (int i = 9; i >= 0; i--) {
                while (a[i]-- > 0)
                    ans = ans * 10 + i;
            }
            ans = -ans;
        }
        return ans;
    }
}

// Code by Md Zaid Alam