package c1_fundamentals.c1_1_programming_model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.14
 * 编写一个静态方法lg()，接受一个整型参数N，返回不大于log2(N) 的最大整数。不要使用Math 库。
 */
public class Q1_1_14 {

	public static void main(String[] args){
		StdOut.println("请输入一个整数：");
		int n = StdIn.readInt();
		int result = lg(n);
		StdOut.printf("不大于log2(%s)的最大整数为：%s", n, result);
	}

	/**
	 * 返回不大于log2(N) 的最大整数
	 * @param n
	 * @return
	 */
	private static int lg(int n){
		int a = 0;
		while(n/2 > 0){
			a++;
			n /= 2;
		}
		return a;
	}
}
