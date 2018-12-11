package com.vijay.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MainReader {
	static class FastReader {
		BufferedReader br;
		@Override
		public String toString() {
			return "FastReader [br=" + br + ", st=" + st + "]";
		}

		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
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
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		FastReader s = new FastReader();
		System.out.println("Inputs");
		int n = s.nextInt();
		int k = s.nextInt();
		int count = 0;
		System.out.println("N at start is: "+n);
		while (n-- > 0) {
			int x = s.nextInt();
			System.out.println("N: "+n+" X: "+x+" s: "+s+" K: "+k);
			if (x % k == 0)
				count++;
			
			System.out.println("Count for N: "+n+" is: "+count);
		}
		System.out.println("Count is: "+count);
	}
}
