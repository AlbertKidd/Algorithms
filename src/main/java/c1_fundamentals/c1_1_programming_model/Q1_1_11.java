package c1_fundamentals.c1_1_programming_model;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

/**
 * 编写一段代码，打印出一个二维布尔数组的内容。其中，使用*表示真，-表示假。打印出行号和列号。
 */
public class Q1_1_11 {

	public static void main(String[] args){
		boolean[][] b = init();
		print(b);
	}

	/**
	 * 打印二维布尔数组，* 表示true，- 表示false
	 * @param b
	 */
	public static void print(boolean[][] b){
		printColumns(b);
		printRows(b);
	}

	/**
	 * 根据命令行参数创建一个二维boolean数组，内容随机
	 * @return
	 */
	private static boolean[][] init(){
		StdOut.println("请输入数组行数：");
		int rows = StdIn.readInt();
		StdOut.println("请输入数组列数：");
		int columns = StdIn.readInt();
		boolean[][] b = new boolean[rows][columns];
		for (boolean[] row : b){
			for (boolean value : row){
				value = StdRandom.bernoulli();
			}
		}
		return b;
	}

	/**
	 * 将boolean转为字符串，* 表示true，- 表示false
	 * @param b
	 * @return
	 */
	private static String trans(boolean b){
		if(b){
			return "*";
		}else{
			return "-";
		}
	}

	/**
	 * 打印列编号
	 * @param b
	 */
	private static void printColumns(boolean[][] b){
		StdOut.print("        ");
		int columns = b[0].length;
		for (int i = 0; i < columns; i++){
			StdOut.print(String.format("    Column %s   ", i));
		}
		StdOut.println();
	}

	/**
	 * 打印行号以及每一行的数据
	 * @param b
	 */
	private static void printRows(boolean[][] b){
		for (int i = 0; i < b.length; i++){
			StdOut.print(String.format(" line %s ", i));
			boolean[] row = b[i];
			for (boolean value : row){
				StdOut.print(String.format("       %s       ", trans(value)));
			}
			StdOut.println();
		}
	}

}
