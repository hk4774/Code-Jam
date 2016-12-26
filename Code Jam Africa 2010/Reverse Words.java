import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Google_codejam_africa_2010_reverse_words {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream ipstream = new FileInputStream(new File("B-large-practice.in"));
		OutputStream os = new FileOutputStream(new File("B-large-practice.out"));
		Scanner s = new Scanner(ipstream);
		int t = s.nextInt();
		int a = 0;
		while (t-- > 0) {
			a++;
			String words = s.nextLine();
			List<String> list = Arrays.asList(words.split("\\s+"));
			Collections.reverse(list);
			String finalOutput = "Case #" + a + ": ";
			for (int i = 0; i < list.size(); i++) {
				finalOutput += list.get(i) + " ";
			}
			finalOutput += "\n";
			os.write(finalOutput.getBytes());
		}
		os.flush();
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
