package Chapter_1_Fundamentals;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/*在计算机上运行以下程序：
 * public class Fibonacci { 
		public static long F(int N) { 
			if (N == 0) return 0; if (N == 1) return 1; return F(N-1) + F(N-2); } 
		public static void main(String[] args) { 
			for (int N = 0; N < 100; N++) StdOut.println(N + " " + F(N)); } } 
计算机用这段程序在一个小时之内能够得到F(N) 结果的最大N 值是多少？开发F(N) 的一 个更好的实现，用数组保存已经计算过的值。
*/

public class Q1_1_19 {
	public static void main(String[] args){
		F(StdIn.readInt());
	}
	public static long[] F(int N){
		long[] a = new long[N];
		a[0] = 0;
		a[1] = 1;
		for(int i = 2; i < N; i++){
			a[i] = a[i-1] + a[i-2];
		}
		for(int i = 0; i < N; i++){
			StdOut.print(a[i] + " ");
		}
		return a;
	}
}
