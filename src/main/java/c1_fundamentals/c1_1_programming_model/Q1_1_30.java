package c1_fundamentals.c1_1_programming_model;


//数组练习。编写一段程序，创建一个N×N 的布尔数组a[][]。其中当i 和j 互质时（没有相同因子），a[i][j] 为true，否则为false。

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Q1_1_30 {
	public static void main(String[] args){
		int N = StdIn.readInt();
		boolean[][] a = new boolean[N][N];
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(gcd(i,j) == 1)
					a[i][j] = true;
				else a[i][j] = false;
				StdOut.print(a[i][j] + "  ");
			}
			StdOut.println();
		}
	}
	public static int gcd(int p, int q){
		if(p == 0 || q == 0)
			return 1;
		if(p % q == 0)
			return q;
		else
			return gcd(q, p%q);
	}
}
