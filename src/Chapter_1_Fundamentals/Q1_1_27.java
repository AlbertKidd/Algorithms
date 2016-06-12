package Chapter_1_Fundamentals;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

//二项分布。
//估计用以下代码计算binomial(100, 50) 将会产生的递归调用次数： 
//public static double binomial(int N, int k, double p) { 
//		if (N == 0 && k == 0) return 1.0; and if (N < 0 || k < 0) return 0.0; 
//		return (1.0 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1); } 
//将已经计算过的值保存在数组中并给出一个更好的实现。

public class Q1_1_27 {
	public static void main(String[] args){
		int n = StdIn.readInt();
		int k = StdIn.readInt();
		double p = StdIn.readDouble();
		StdOut.println(binomial(n, k, p));
		StdOut.print(optimizedBinomial(n, k, p));
	}
	public static double binomial(int n, int k, double p){
		StdOut.println(n + " " + k);
		if(n == 0 && k ==0)
			return 1;
		if(n < 0 || k < 0 || k > n)
			return 0;
		return (1 - p)*binomial(n-1, k, p) + p * binomial(n-1, k-1, p);
	}
	public static double optimizedBinomial(int n, int k, double p){
		double[][] a = new double[n+1][k+1];
		a[0][0] = 1;
		for(int j = 1; j < n+1; j++)
			a[j][0] = (1-p)*a[j-1][0];
		for(int i=0; i<n+1; i++){
			for(int j=1; j<k+1 && j<=i; j++){
				a[i][j] = (1-p)*a[i-1][j] + p*a[i-1][j-1];
			}
		}
		return a[n][k];
	}
}
