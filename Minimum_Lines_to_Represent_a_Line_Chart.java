class Solution {
    public int minimumLines(int[][] stockPrices) {
        if(stockPrices.length == 1)
            return 0;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int[] a: stockPrices){
            arr.add(new ArrayList<>());
            arr.get(arr.size()-1).add(a[0]);
            arr.get(arr.size()-1).add(a[1]);
        }
        Collections.sort(arr, (a, b) -> a.get(0) - b.get(0));
        int[][] prev = new int[2][2];
        prev[0][0] = arr.get(0).get(0);
        prev[0][1] = arr.get(0).get(1);
        prev[1][0] = arr.get(1).get(0);
        prev[1][1] = arr.get(1).get(1);
        int ans = 1;
        for(int i = 2; i < stockPrices.length; i++){
            if(!check(prev, arr.get(i).get(0), arr.get(i).get(1))){
                ans++;
            }
            prev[0][0] = prev[1][0];
            prev[0][1] = prev[1][1];
            prev[1][0] = arr.get(i).get(0);
            prev[1][1] = arr.get(i).get(1);
        }
        return ans;
    }
    
    boolean check(int[][] a, int x, int y){
        if(a[1][1] - a[0][1] == 0 && y-a[1][1] == 0)
            return true;
        return (long)(a[0][0] - a[1][0])*(a[1][1] - y) == (long)(a[1][0] - x)*(a[0][1] - a[1][1]);
    }
    int gcd(int a, int b){
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
}

// Code by Md Zaid Alam