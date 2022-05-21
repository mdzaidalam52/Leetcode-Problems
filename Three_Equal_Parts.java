class Solution {
    public int[] threeEqualParts(int[] arr) {
        int numOfOnes = 0;
        for(int i: arr){
            numOfOnes += i;
        }
        if(numOfOnes%3 != 0)
            return new int[]{-1, -1};
        if(numOfOnes == 0)
            return new int[]{0, 2};
        int[] ind = getIndices(arr, numOfOnes/3);
        int[] a = solve(arr, ind[1], ind[2]);
        int second = a[0]+1;
        if(a[0] == -1)
            return new int[]{-1, -1};
        a = solve(arr, ind[0], ind[2]);
        if(a[0] < ind[1] && a[0] >= 0)
            return new int[]{a[0], second};
        return new int[] {-1, -1};
    }
    
    int[] solve(int[] a, int b, int c){
        for(int i = 0; c+i < a.length; i++){
            if(i+b >= c || a[i+b] != a[i+c]){
                return new int[]{-1, -1};
            }
            if(c + i == a.length-1){
                return new int[]{b+i, c};
            }
        }
        return null;
    }
    
    int[] getIndices(int[] a, int k){
        int n = 0;
        int[] ind = new int[3];
        Arrays.fill(ind, -1);
        for(int i = 0; i < a.length; i++){
            n += a[i];
            if(n == 1 && ind[0] == -1)
                ind[0] = i;
            if(n == k+1 && ind[1] == -1)
                ind[1] = i;
            if(n == 2*k+1 && ind[2] == -1){
                ind[2] = i;
                return ind;
            }
        }
        return ind;
    }
}

// Code by Md Zaid Alam