package c1_fundamentals.c1_1_programming_model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.20
 * 编写一个递归的静态方法计算ln(N!) 的值。
 */
public class Q1_1_20 {

	public static void main(String[] args){
		StdOut.print("请传入参数N");
		int n = StdIn.readInt();
		StdOut.println(factorialLn(n));
	}

	private static double factorialLn(int n){
		if (n < 1){
			throw new RuntimeException("请传入正整数");
		}else if (n == 1) {
			return 0;
		}else {
			return Math.log(n) + factorialLn(n - 1);
		}
	}
	
}
