public class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        int ans = 0;
        Arrays.sort(passengers);
        Arrays.sort(buses);
        int next = 0;
        for(int i = 0; i < buses.length; i++){
            int k = 0;
            while(k < capacity && next < passengers.length && buses[i] >= passengers[next]){
                k++;
                next++;
            }
            if(k < capacity){
                ans = buses[i];
                int n = next-1;
				while(n >= 0 && ans == passengers[n]){
					n--;
					ans--;
				}
            }else{
                int n = next-2;
                ans = passengers[next-1]-1;
                while(n >= 0 && ans == passengers[n]){
                    n--;
                    ans--;
                }
            }
        }
        return ans;
        
    }
}

// Code by Md Zaid Alam