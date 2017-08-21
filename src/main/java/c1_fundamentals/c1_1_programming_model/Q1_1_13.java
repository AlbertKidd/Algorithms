package c1_fundamentals.c1_1_programming_model;


//编写一段代码，打印出一个M 行N 列的二维数组的转置（交换行和列）。

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

public class Q1_1_13 {
	public static void main(String[] args){
		int m = StdIn.readInt();
		int n = StdIn.readInt();
		int[][] a = new int[m][n];
		int[][] b = new int[n][m];
		a = randomInitial(a);
		b = migrate(a, b);
	}
	
	private static int[][] randomInitial(int[][] x){
		StdOut.println("初始化数组");
		for(int i = 0; i < x.length; i++){
			for(int j = 0; j < x[0].length; j++){
				x[i][j] = StdRandom.uniform(1024);
				StdOut.print(x[i][j] + " ");
			}
			StdOut.println();
		}
		return x;
	}
	
	private static int[][] migrate(int[][] x, int[][] y){
		StdOut.println("转置数组");
		for(int i = 0; i < y.length; i++){
			for(int j = 0; j < y[0].length; j++){
				y[i][j] = x[j][i];
				StdOut.print(y[i][j] + " ");
			}
			StdOut.println();
		}
		return y;
	}
}
