import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		FastReader in = new FastReader();
		int tc = 1;
		tc = in.nextInt();
		for(int t = 0; t < tc; t++) {
			new Solve(in);
		}
	}
	
	static class Solve {
		Solve(FastReader in) {
			
			// input
			int n = in.nextInt();
			String s = in.next();
			
			boolean checker = false;
			for(int i = 0; i < s.length(); i++) {
				// check if the 0 or 5 digit in the given number
				if(s.charAt(i) == '0' || s.charAt(i) == '5') {
					checker = true;
					break;
				}
				
			}
			
			// output
			System.out.println(checker ? "Yes" : "No");
		}
	}
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		int nextInt() {
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
				str = br.readLine();
			} catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
