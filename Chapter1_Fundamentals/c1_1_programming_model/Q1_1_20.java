package c1_1_programming_model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

//编写一个递归的静态方法计算ln(N!) 的值。

public class Q1_1_20 {
	public static void main(String[] args){
		int i = StdIn.readInt();
		StdOut.println(factorialLn1(i));
	}
	
	public static double factorialLn1(int N){
		if(N > 1)
			return Math.log(N) + factorialLn1(N-1);
		else
			return 0;
	}
}
