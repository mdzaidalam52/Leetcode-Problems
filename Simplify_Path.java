class Solution {
    public String simplifyPath(String path) {
        String[] a = path.split("/");
        Deque<String> d = new LinkedList<>();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i].equals("") || a[i].equals(".")) {
                continue;
            }
            if (a[i].equals("..")) {
                if (d.size() > 0)
                    d.removeFirst();
            } else {
                d.addFirst(a[i]);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!d.isEmpty()) {
            ans.append("/" + d.removeLast());
        }
        if (ans.length() == 0)
            return "/";
        return ans.toString();
    }
}

// Code by Md Zaid Alam