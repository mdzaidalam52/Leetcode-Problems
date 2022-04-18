class Solution {
    public int maxTrailingZeros(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        Factors[][] a = new Factors[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = check(grid[i][j]);
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 1; j < n; j++){
                a[j][i].z = a[j][i].z + a[j-1][i].z;
                a[j][i].t = a[j][i].t + a[j-1][i].t;
                a[j][i].f = a[j][i].f + a[j-1][i].f;
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            int z = 0, f = 0, t = 0;
            for(int j = 0; j < m; j++){
                Factors fact = check(grid[i][j]);
                z += fact.z;
                f += fact.f;
                t += fact.t;
                fact = calc(a, -1, i-1, 0);
                ans = Math.max(z + fact.z + Math.min(f + fact.f, t + fact.t), ans);
                fact = calc(a, i, n-1, 0);
                ans = Math.max(z + fact.z + Math.min(f + fact.f, t + fact.t), ans);
                fact = calc(a, -1, i-1, j);
                ans = Math.max(z + fact.z + Math.min(f + fact.f, t + fact.t), ans);
                fact = calc(a, i, n-1, j);
                ans = Math.max(z + fact.z + Math.min(f + fact.f, t + fact.t), ans);
            }
            z = 0;
            f = 0;
            t = 0;
            for(int j = m-1; j >= 0; j--){
                Factors fact = check(grid[i][j]);
                z += fact.z;
                f += fact.f;
                t += fact.t;
                fact = calc(a, -1, i-1, m-1);
                ans = Math.max(z + fact.z + Math.min(f + fact.f, t + fact.t), ans);
                fact = calc(a, i, n-1, m-1);
                ans = Math.max(z + fact.z + Math.min(f + fact.f, t + fact.t), ans);
                fact = calc(a, -1, i-1, j);
                ans = Math.max(z + fact.z + Math.min(f + fact.f, t + fact.t), ans);
                fact = calc(a, i, n-1, j);
                ans = Math.max(z + fact.z + Math.min(f + fact.f, t + fact.t), ans);
            }
        }
        return ans;
    }
    
    Factors calc(Factors[][] a, int i, int j, int k){

        Factors ans = new Factors(0, 0, 0);
        if(i == j)
            return ans;
        Factors a1 = i == -1 ? new Factors(0, 0, 0) : a[i][k];
        Factors a2 = a[j][k];
        ans.f = a2.f - a1.f;
        ans.t = a2.t - a1.t;
        ans.z = a2.z - a1.z;
        return ans;

    }
    
    Factors check(int a){
        int t = 0, z = 0, f = 0;
        while(a % 10 == 0 && a > 0){
            z++;
            a /= 10;
        }
        while(a % 5 == 0 && a > 0){
            f++;
            a /= 5;
        }
        while(a % 2 == 0 && a > 0){
            t++;
            a /= 2;
        }
        return new Factors(z, f, t);
    }
    
    class Factors{
        int z, f, t;
        Factors(int z, int f, int t){
            this.z = z;
            this.f = f;
            this.t = t;
        }
    }
}

// Code by Md Zaid Alam