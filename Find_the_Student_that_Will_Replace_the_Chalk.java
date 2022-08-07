class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long[] a = new long[chalk.length];
        a[0] = chalk[0];
        if(k < chalk[0])
            return 0;
        for(int i = 1; i < chalk.length; i++){
            a[i] = a[i-1] + chalk[i];
        }
        long len = k%a[chalk.length-1];
        k = Arrays.binarySearch(a, len);
        if(k < 0){
            return -k-1;
        }else{
            return (k + 1)%chalk.length;
        }
    }
}

// Code by Md Zaid Alam