package c1_fundamentals.c1_1_programming_model;



//编写一个静态方法lg()，接受一个整型参数N，返回不大于log2(N) 的最大整数。不要使用Math 库。

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Q1_1_14 {
	public static void main(String[] args){
		int n = StdIn.readInt();
		lg(n);
	}
	
	private static int lg(int n){
		int a = 0;
		while(n/2 > 0){
			a++;
			n /= 2;
		}
		StdOut.print(a);
		return a;
	}
}
