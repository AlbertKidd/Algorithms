package c1_fundamentals.c1_1_programming_model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.27
 * 二项分布。
 * 估计计算binomial(100, 50, 0.25) 将会产生的递归调用次数： 
 * 将已经计算过的值保存在数组中并给出一个更好的实现。
 */
public class Q1_1_27 {

	public static void main(String[] args){
		StdOut.println("请输入实验总数n:");
		int n = StdIn.readInt();
		StdOut.println("请输入出现次数k:");
		int k = StdIn.readInt();
		StdOut.println("请输入出现概率p:");
		double p = StdIn.readDouble();

		long begin1 = System.currentTimeMillis();
		double result1 = binomial(n, k, p);
		StdOut.printf("binomial函数计算结果为%.10f，共计耗时%sms%n", result1, System.currentTimeMillis() - begin1);

		long begin2 = System.currentTimeMillis();
		double result2 = binomialOptimized(n, k, p);
		StdOut.printf("binomialOptimized函数计算结果为%.10f，共计耗时%sms%n", result2, System.currentTimeMillis() - begin2);
	}

	/**
	 * 原二项分布函数
	 * @param n
	 * @param k
	 * @param p
	 * @return
	 */
	private static double binomial(int n, int k, double p){
		if(n == 0 && k ==0)
			return 1;
		if(n < 0 || k < 0)
			return 0;
		return (1 - p) * binomial(n-1, k, p) + p * binomial(n-1, k-1, p);
	}

	/**
	 * 优化后的二项分布函数
	 * @param n
	 * @param k
	 * @param p
	 * @return
	 */
	private static double binomialOptimized(int n, int k, double p){
		double[][] arr = new double[n+1][k+1];
		arr[0][0] = 1;
		for (int i = 1; i <= n; i++){
			arr[i][0] = (1 - p) * arr[i - 1][0];
		}
		for (int i = 1; i <= k; i++){
			arr[0][i] = 0;
		}
		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= k; j++){
				arr[i][j] = (1 - p) * arr[i - 1][j] + p * arr[i - 1][j - 1];
			}
		}
		return arr[n][k];
	}
}
