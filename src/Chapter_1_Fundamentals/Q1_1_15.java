package Chapter_1_Fundamentals;

import edu.princeton.cs.algs4.StdOut;

public class Q1_1_15 {
	public static void main(String[] args){
		int[] a = {1, 3, 4, 2, 3, 1, 3};
		int M = 6;
		instogram(a, M);
	}
	public static int[] instogram(int[] a, int M){
		int[] b = new int[M];
		int n = 0;
		for(int i = 0; i < M; i++){
			for(int j = 0; j < a.length; j++){
				if(i == a[j]) n++;
			}
			b[i] = n;
			StdOut.print(b[i] + " ");
			n = 0;
		}
		return b;
	}
}
