class Solution {
    public int findSpecialInteger(int[] arr) {
        int a;
        if(arr.length % 4 == 0){
            a = arr.length/4 + 1;
        }else{
            a = (int)(Math.ceil(arr.length/4.0));
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == arr[i+a-1]){
                return arr[i];
            }
        }
        
        return -1;
    }
}

// Code by Md Zaid Alam