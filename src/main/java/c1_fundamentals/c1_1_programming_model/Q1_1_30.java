package c1_fundamentals.c1_1_programming_model;

import common.MathEx;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 1.1.30
 * 数组练习。
 * 编写一段程序，创建一个N×N的布尔数组a[][]。其中当i和j互质时（没有相同因子），a[i][j]为true，否则为false。
 * 注：此处的数组的i与j从1开始计算
 */
public class Q1_1_30 {

	public static void main(String[] args){
		StdOut.println("请输如数组大小N：");
		int n = StdIn.readInt();
		boolean[][] arr = new boolean[n][n];
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				arr[i][j] = MathEx.gcd(i + 1, j + 1) == 1;
			}
		}
		StdOut.println("生成的Boolean数组为：");
		for (int i = 0; i < n; i++){
			StdOut.println(Arrays.toString(arr[i]));
		}
	}
}
