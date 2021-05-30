import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		InputReader in = new InputReader(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int[] a = intInput(n, in);
			Arrays.parallelSort(a);
			int ans = 0;
			for(int i = 0; i < n; i++) {
				ans++;
				if(a[i] > 0) {
					break;
				}
			}
			
			int k = a[ans-1];
			for(int i = 1; i < ans; i++) {
				if(a[i] - a[i-1] < k) {
					ans--;
					break;
				}
			}
			System.out.println(ans);
			
			
		}
	}

	static long gcd(long a, long b) {
		if (a % b == 0) {
			return b;
		} else {
			return gcd(b, a % b);
		}
	}

	static void reverseArray(int[] a) {
		for (int i = 0; i < (a.length >> 1); i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
	}

	static int[] intInput(int n, InputReader in) {
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++)
			a[i] = in.nextInt();
		return a;
	}

	static long[] longInput(int n, InputReader in) {
		long[] a = new long[n];
		for (int i = 0; i < a.length; i++)
			a[i] = in.nextLong();
		return a;
	}

	static String[] strInput(int n, InputReader in) {
		String[] a = new String[n];
		for (int i = 0; i < a.length; i++)
			a[i] = in.next();
		return a;
	}
}

class Data {
	int i, v;

	Data(int i, int v) {
		this.i = i;
		this.v = v;
	}
}

class compare implements Comparator<Data> {

	@Override
	public int compare(Data o1, Data o2) {
		return o1.v - o2.v;
	}

}

class InputReader {
	public BufferedReader reader;
	public StringTokenizer tokenizer;

	public InputReader(InputStream stream) {
		reader = new BufferedReader(new InputStreamReader(stream), 32768);
		tokenizer = null;
	}

	public String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	long nextLong() {
		return Long.parseLong(next());
	}

	double nextDouble() {
		return Double.parseDouble(next());
	}

	String nextLine() {
		String str = "";
		try {
			str = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}

}


//Code by Md Zaid Alam