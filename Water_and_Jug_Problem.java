class Solution {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if(targetCapacity > jug1Capacity + jug2Capacity)
            return false;
        return (targetCapacity % gcd(Math.max(jug1Capacity, jug2Capacity), Math.min(jug1Capacity, jug2Capacity)) == 0);
    }
    static long gcd(long a, long b) {
        long temp;
        while (b > 0) {
            a %= b;
            temp = a;
            a = b;
            b = temp;
        }
        return a;
    }
}

// Code by Md Zaid Alam