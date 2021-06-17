/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long s = 1;
        long e = n;
        if(s == n)
            return n;
        
        while(s < e){
            long mid = (s+e)/2;
            if(isBadVersion((int)mid)){
                e = mid;
            }else
            	s = mid+1;
        }
        return (int)s;
    }
}

// Code by Md Zaid Alam