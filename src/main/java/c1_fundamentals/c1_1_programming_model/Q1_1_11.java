package c1_fundamentals.c1_1_programming_model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

//编写一段代码，打印出一个二维布尔数组的内容。其中，使用* 表示真，空格表示假。打印出行号和列号。

public class Q1_1_11 {
	public static void main(String[] args){
		boolean[][] b = new boolean[StdIn.readInt()][StdIn.readInt()];
		initial(b);
		StdOut.print("+++++ ");
		for(int x=0; x<getColums(b); x++){
			StdOut.print("column" + x + " ");
		}
		StdOut.println();
		for(int i=0; i<b.length; i++){
			StdOut.print("line" + i + " ");
			for(int j=0; j<b[i].length; j++){
				StdOut.print("   " + trans(b[i][j]) + "    ");
			}
			StdOut.println();
		}
				
	}
	private static boolean[][] initial(boolean[][] b){
		for(int i=0; i<b.length; i++){
			for(int j=0; j<b[i].length; j++)
				b[i][j] = StdRandom.bernoulli();
		}
		return b;
	}
	private static String trans(boolean b){
		if(b)
			return "*";
		else
			return "-";
	}
	private static int getColums(boolean[][] b){
		int columns = 0;
		for(int i=0; i<b.length; i++){
			if(b[i].length > columns)
				columns = b[i].length;
		}
		return columns;
	}
}
