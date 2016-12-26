import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Google_codejam_africa_2010_store_credit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream ipstream = new FileInputStream(new File("A-large-practice.in"));
		OutputStream os = new FileOutputStream(new File("A-large-practice.out"));
		String output = "";
		Scanner s = new Scanner(ipstream);
		int t = s.nextInt();
		int a = 0;
		while (t-- > 0) {
			a++;
			int C = s.nextInt();
			int l = s.nextInt();
			List<Integer> numbers = new ArrayList<Integer>();
			for (int i = 0; i < l; i++) {
				int temp = s.nextInt();
				numbers.add(temp);
			}
			int[] result = new int[2];
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < numbers.size(); i++) {
				if (map.containsKey(numbers.get(i))) {
					int index = map.get(numbers.get(i));
					result[0] = index + 1;
					result[1] = i + 1;

				} else {
					map.put(C - numbers.get(i), i);
				}
			}
			output += "Case #" + a + ": " + result[0] + " " + result[1] + "\n";
		}
		os.write(output.getBytes());
		os.close();
	}

	public static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in), 32768);
		}

		public String nextLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
				return null;
			}
		}

		public boolean hasNext() {
			while (st == null || !st.hasMoreTokens()) {
				String s = nextLine();
				if (s == null)
					return false;
				st = new StringTokenizer(s);
			}
			return true;
		}

		public String next() {
			hasNext();
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}
