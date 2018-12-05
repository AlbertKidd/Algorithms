package c1_fundamentals.c1_1_programming_model;

import edu.princeton.cs.algs4.StdOut;

/**
 * 在计算机上运行Fibonacci程序：
 * 计算机用这段程序在一个小时之内能够得到f(n) 结果的最大N 值是多少？
 *
 * 开发f(n) 的一个更好的实现，用数组保存已经计算过的值。
 *
 */
public class Q1_1_19 {

	public static void main(String[] args){
	}

	private static long[] f(int N){
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

	static class Fibonacci{


		public static void main(String[] args) {
			for (int n = 0; n < 100; n++){
				long before = System.nanoTime();
				long result = f1(n);
				long after = System.nanoTime();
				StdOut.printf("参数值为：%s，返回值为：%s，耗费时常：%s纳秒%n", n, result, after - before);
			}
		}

		/**
		 * 原始函数
		 * @param n
		 * @return
		 */
		static long f(int n){
			if (n == 0) return 0;
			if (n == 1) return 1;
			return f(n - 1) + f(n - 2);
		}

		private static long f1(int n){
			long[] arr = new long[n + 1];
			arr[0] = 0;
			arr[1] = 1;
			for (int i = 2; i <= n; i++){
				arr[i] = arr[i - 1] + arr[i - 2];
			}
			return arr[n];
		}
	}


}
