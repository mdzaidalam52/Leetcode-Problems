class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;
        for(int i: arr)
            total += i;
        if(total%3 != 0)
            return false;
        int current = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            current += arr[i];
            if(current == total/3){
                current = 0;
                count++;
            }
            if(count == 2 && i < arr.length-1)
                return true;
        }
        return false;
    }
}

// Code by Md Zaid Alam