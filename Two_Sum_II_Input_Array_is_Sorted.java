class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        while(i < j){
            if(numbers[i] + numbers[j] == target){
                int[] a = new int[2];
                a[0] = i+1;
                a[1] = j+1;
                return a;
            }else if(numbers[i] + numbers[j] < target){
                while(numbers[i] + numbers[j] < target) i++;
            }else{
                while(numbers[i] + numbers[j] > target) j--;
            }
        }
        return null;
    }
}

// Code by Md Zaid Alam