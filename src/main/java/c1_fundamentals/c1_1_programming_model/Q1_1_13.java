package c1_fundamentals.c1_1_programming_model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 1.1.13 编写一段代码，打印出一个M 行N 列的二维数组的转置（交换行和列）。
 */
public class Q1_1_13 {

	public static void main(String[] args){
		int[][] arr = randomInitial();
		StdOut.println("原始数组：");
		print(arr);
		int[][] result = migrate(arr);
		StdOut.println("转置数组：");
		print(result);
	}

	/**
	 * 获取一个指定行数列数的随机二位int数组
	 * @return
	 */
	private static int[][] randomInitial(){
		StdOut.println("请输入行数：");
		int rows = StdIn.readInt();
		StdOut.println("请输入列数：");
		int columns = StdIn.readInt();
		int[][] arr = new int[rows][columns];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				arr[i][j] = StdRandom.uniform(1024);
			}
		}
		return arr;
	}

	/**
	 * 返回二维数组的转置数组
	 * @param x
	 * @return
	 */
	private static int[][] migrate(int[][] x){
		int rows= x.length;
		int columns = x[0].length;
		int[][] result = new int[columns][rows];
		for(int i = 0; i < columns; i++){
			for(int j = 0; j < rows; j++){
				result[i][j] = x[j][i];
			}
		}
		return result;
	}

	/**
	 * 打印二位数组
	 * @param arr
	 */
	private static void print(int[][] arr){
		for (int[] row : arr){
			for (int column : row){
				StdOut.printf("%4s", column);
			}
			StdOut.println();
		}
	}
}
