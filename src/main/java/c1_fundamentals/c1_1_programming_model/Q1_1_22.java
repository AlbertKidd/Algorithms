package c1_fundamentals.c1_1_programming_model;


//使用1.1.6.4 节中的rank() 递归方法重新实现BinarySearch 并跟踪该方法的调用。
//每当该方法被调用时，打印出它的参数lo 和hi 并按照递归的深度缩进。
//提示：为递归方法添加一个参数来保存递归的深度。

import edu.princeton.cs.introcs.StdOut;

public class Q1_1_22 {
	static String s = "";
	public static void main(String[] args){
		int[] a = {1, 21, 25, 34, 46, 56, 67};
		int b = rank(46, a);
		StdOut.print(b);
	}

	private static int rank(int key, int[] a){
		return rank(key, a, 0, a.length-1);
	}

	private static int rank(int key, int[] a, int lo, int hi){
		StdOut.println(s + lo + "," + hi);
		s += "  ";
		if(lo > hi){
			StdOut.print(s);
			return -1;
		}
		
		int mid = lo + (hi - lo)/2;
		if(key > a[mid])
			return rank(key, a, mid+1, hi);
		else if(key < a[mid])
			return rank(key, a, lo, mid-1);
		else {
			StdOut.print(s);
			return mid;
		}
	}
}
