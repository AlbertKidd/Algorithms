package c1_1_programming_model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

//编写一个静态方法lg()，接受一个整型参数N，返回不大于log2N 的最大整数。不要使用Math 库。

public class Q1_1_14 {
	public static void main(String[] args){
		int n = StdIn.readInt();
		lg2(n);
	}
	
	public static int lg2(int n){
		int a = 0;
		while(n/2 > 0){
			a++;
			n /= 2;
		}
		StdOut.print(a);
		return a;
	}
}
