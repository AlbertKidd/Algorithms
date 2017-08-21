package c1_fundamentals.c1_1_programming_model;


// 给出使用欧几里德算法计算105和24的最大公约数的过程中得到的一系列p和q的值。
//扩展该算法中的代码得到一个程序Euclid，从命令行接受两个参数，计算它们的最大公约数并打印出每次调用递归方法时的两个参数。
//使用你的程序计算1111111和1234567的最大公约数。

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Q1_1_24 {
	public static void main(String[] args){
		int a = StdIn.readInt();
		int b = StdIn.readInt();
		StdOut.print(gcd(a, b));
	}
	
	public static int gcd(int p, int q){
		StdOut.println(p + " " + q);
		if(q == 0)
			return p;
		int r = p % q;
		return gcd(q, r);
	}
}
