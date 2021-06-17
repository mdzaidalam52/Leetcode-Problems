/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long s = 1;
        long e = n;
        if(s == n)
            return n;
        
        while(s < e){
            long mid = (s+e)/2;
            int k = guess((int)mid);
            if(k == -1){
                e = mid;
            }else if(k == 1)
            	s = mid+1;
            else
                return (int)mid;
        }
        return (int)s;
    }
}

// Code by Md Zaid Alam