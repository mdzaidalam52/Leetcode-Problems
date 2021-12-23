class Solution {
    public String reorganizeString(String s) {
        if (s.length() == 1) {
            return s;
        }

        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
        }
        ArrayList<Data> d = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (a[i] != 0) {
                d.add(new Data((char) (i + 'a'), a[i]));
            }
        }
        Collections.sort(d, new compare());

        char[] ans = new char[s.length()];
        int k = 0;
        for (int i = 0; i < d.size(); i++) {
            Data c = d.get(i);
            while (c.i > 0) {
                if (k >= s.length())
                    k = 1;
                ans[k] = c.c;
                k += 2;
                c.i--;
            }
        }

        if (check(ans)) {
            return new String(ans);
        } else {
            return "";
        }
    }
    
	boolean check(char[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] == a[i - 1])
				return false;
		}
		return true;
	}
}


class Data {
	int i;
	char c;

	Data(char c, int i) {
		this.c = c;
		this.i = i;
	}
}

class compare implements Comparator<Data> {

	@Override
	public int compare(Data o1, Data o2) {
		return (-o1.i + o2.i);
	}

}

// Code by Md Zaid Alam