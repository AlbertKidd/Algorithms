package c1_fundamentals.c1_1_programming_model;

import common.Printer;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 编写一个静态方法histogram()，接受一个整型数组a[] 和一个整数M 为参数并返回一个大小为M的数组，
 * 其中第i个元素的值为整数i在参数数组中出现的次数。
 *
 * 如果a[]中的值均在0到M-1之间，返回数组中所有元素之和应该和a.length 相等。
 */
public class Q1_1_15 {

	public static void main(String[] args){
		StdOut.println("请输入参数m：");
		int m = StdIn.readInt();
		int[] arr = init(m);

		int[] result = instogram(arr, m);
		StdOut.print("结果数组为：");
		Printer.print(result);
		int plusResult = 0;
		for (int i : result){
			plusResult += i;
		}
		StdOut.printf("结果数组元素之和为：%s", plusResult);


	}

	/**
	 * 初始化一个数组，其中元素不大于传入的参数
	 * @param m
	 * @return
	 */
	private static int[] init(int m){
		StdOut.println("请输入初始数组的大小：");
		int size = StdIn.readInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++){
			arr[i] = StdRandom.uniform(m);
		}
		StdOut.printf("生成的数组为：%s", arr);
		return arr;
	}

	private static int[] instogram(int[] a, int M){
		int[] b = new int[M];
		for(int i = 0; i < M; i++){
			int n = 0;
			for(int j : a)
				if(i == j) n++;
			b[i] = n;
			StdOut.print(b[i] + " ");
		}
		return b;
	}
}
