class Solution {
    public void setZeroes(int[][] a) {
        int m = a.length, n = a[0].length;
        boolean r = false, c = false;
        for(int i = 0; i < n; i++){
            if(a[0][i] == 0){
                c = true;
            }                
        }
        
        for(int i = 0; i < m; i++){
            if(a[i][0] == 0){
                r = true;
            }                
        }
        
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(a[i][j] == 0){
                    a[i][0] = 0;
                    a[0][j] = 0;
                }
            }
        }
        
        for(int i = 1; i < n; i++){
            if(a[0][i] == 0){
                for(int j = 1; j < m; j++){
                    a[j][i] = 0;
                }
            }
        }
        
        for(int i = 1; i < m; i++){
            if(a[i][0] == 0){
                for(int j = 1; j < n; j++){
                    a[i][j] = 0;
                }
            }
        }
        
        if(r){
            for(int i = 0; i < m; i++){
                a[i][0] = 0;
            }
            
        }
        if(c) {
        	for(int i = 0; i < n; i++)
        		a[0][i] = 0;
        }
        
        
        
    }
    
}