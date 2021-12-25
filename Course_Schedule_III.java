class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> {
            if(a[1] != b[1])
                return a[1]-b[1];
            else return a[0] - b[0];
        });
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b-a);
        int time = 0;
        
        for(int[] c : courses){
            time += c[0];
            q.add(c[0]);
            if(time > c[1]){
                time -= q.remove();
            }
        }
        return q.size();
    }
}

// Code by Md Zaid Alam