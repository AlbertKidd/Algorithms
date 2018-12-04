package c1_fundamentals.c1_1_programming_model;


//二项分布。
//估计用以下代码计算binomial(100, 50, 0.25) 将会产生的递归调用次数： 
//public static double binomial(int N, int k, double p) { 
//		if (N == 0 && k == 0) return 1.0; and if (N < 0 || k < 0) return 0.0; 
//		return (1.0 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1); } 
//将已经计算过的值保存在数组中并给出一个更好的实现。

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Q1_1_27 {
	public static void main(String[] args){
		int n = StdIn.readInt();
		int k = StdIn.readInt();
		double p = StdIn.readDouble();
		// TODO: 2017/9/5 add a clock

		long begin1 = System.currentTimeMillis();
		StdOut.println(binomial(n, k, p));
		StdOut.print("binomial 共计耗时：" + (System.currentTimeMillis() - begin1) + "ms");

		long begin2 = System.currentTimeMillis();
		StdOut.print(optimizedBinomial(n, k, p));
		StdOut.print("optimizedBinomial 共计耗时：" + (System.currentTimeMillis() - begin2) + "ms");
	}

	private static double binomial(int n, int k, double p){
		StdOut.println(n + " " + k);
		if(n == 0 && k ==0)
			return 1;
		if(n < 0 || k < 0)
			return 0;
		return (1 - p)*binomial(n-1, k, p) + p * binomial(n-1, k-1, p);
	}

	private static double optimizedBinomial(int n, int k, double p){
		double[][] a = new double[n+1][k+1];
		a[0][0] = 1;
		for(int j = 1; j < n+1; j++)
			a[j][0] = (1-p)*a[j-1][0];
		for(int i=1; i<n+1; i++){
			for(int j=1; j<k+1; j++){
				a[i][j] = (1-p)*a[i-1][j] + p*a[i-1][j-1];
			}
		}
		return a[n][k];
	}
}
