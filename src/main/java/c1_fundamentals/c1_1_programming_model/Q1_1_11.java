package c1_fundamentals.c1_1_programming_model;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;
import lombok.extern.slf4j.Slf4j;

//编写一段代码，打印出一个二维布尔数组的内容。其中，使用* 表示真，空格表示假。打印出行号和列号。

@Slf4j
public class Q1_1_11 {
	public static void main(String[] args){
		boolean[][] b = new boolean[StdIn.readInt()][StdIn.readInt()];
		init(b);
		StdOut.print("       ");
		for(int x = 0; x< b[0].length; x++)
			StdOut.print("c" + x + "     ");
		StdOut.println();
		for(int i=0; i<b.length; i++){
			StdOut.print("r" + i + " ");
			for(int j=0; j<b[i].length; j++){
				StdOut.print("   " + trans(b[i][j]) + "    ");
			}
			StdOut.println();
		}
				
	}

	private static void init(boolean[][] b){
		for(int i=0; i<b.length; i++){
			for(int j=0; j<b[i].length; j++)
				b[i][j] = StdRandom.bernoulli();
		}
	}

	private static String trans(boolean b){
		if(b)
			return "*";
		else
			return "-";
	}
}
