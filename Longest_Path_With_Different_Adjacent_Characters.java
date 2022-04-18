class Solution {
    int ans = 1;

    public int longestPath(int[] parent, String s) {
        ArrayList<Node> arr = new ArrayList<>();
        for (int i = 0; i < parent.length; i++) {
            arr.add(new Node(s.charAt(i)));
        }
        for (int i = 1; i < parent.length; i++) {
            arr.get(parent[i]).child.add(i);
        }
        solve(arr, 0);
        return ans;
    }

    public void solve(ArrayList<Node> arr, int ind) {
        int l = 1;
        int a = 0, b = 0;
        for (int i = 0; i < arr.get(ind).child.size(); i++) {
            solve(arr, arr.get(ind).child.get(i));
        }

        for (int i = 0; i < arr.get(ind).child.size(); i++) {
            if (arr.get(ind).val == arr.get(arr.get(ind).child.get(i)).val)
                continue;
            if (arr.get(arr.get(ind).child.get(i)).length >= a) {
                b = a;
                a = arr.get(arr.get(ind).child.get(i)).length;
            } else if (arr.get(arr.get(ind).child.get(i)).length > b) {
                b = arr.get(arr.get(ind).child.get(i)).length;
            }
        }

        ans = Math.max(ans, a + b + 1);
        arr.get(ind).length = a + 1;

    }

    class Node {
        char val;
        int length;
        ArrayList<Integer> child;

        Node(char val) {
            this.val = val;
            length = 1;
            child = new ArrayList<>();
        }
    }
}

// Code by Md Zaid Alam