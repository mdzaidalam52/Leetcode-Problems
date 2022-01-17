class SubrectangleQueries {
    int[][] a;
    ArrayList<ArrayList<Integer>> updates;

    public SubrectangleQueries(int[][] rectangle) {
        a = rectangle;
        updates = new ArrayList<>();
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        updates.add(new ArrayList<>());
        updates.get(updates.size()-1).add(row1);
        updates.get(updates.size()-1).add(col1);
        updates.get(updates.size()-1).add(row2);
        updates.get(updates.size()-1).add(col2);
        updates.get(updates.size()-1).add(newValue);
    }
    
    public int getValue(int row, int col) {
        for(int i = updates.size() - 1; i >= 0; i--){
            if(updates.get(i).get(0) <= row && updates.get(i).get(1) <= col && updates.get(i).get(2) >= row && updates.get(i).get(3) >= col)
                return updates.get(i).get(4);
        }
        return a[row][col];
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */

 // Code by Md Zaid Alam