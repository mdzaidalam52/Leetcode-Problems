class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        ArrayList<int[]> arr = new ArrayList<>();
        int n = trips.length;
        for(int i = 0; i < n; i++){
            arr.add(trips[i]);
        }
        Collections.sort(arr, (a, b)-> {
            if(a[1]!=b[1]){
                return a[1]-b[1];
            }else{
                return a[2]-b[2];
            }
        });
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[2]-b[2]);
        for(int i = 0; i < n; i++){
            while(!q.isEmpty() && q.peek()[2] <= arr.get(i)[1]){
                capacity += q.peek()[0];
                q.remove();
            }
            if(capacity >= arr.get(i)[0]){
                capacity -= arr.get(i)[0];
                q.add(arr.get(i));
            }else{
                return false;
            }
        }
        return true;
    }
}

// Code by Md Zaid Alam