package c1_fundamentals.c1_1_programming_model;


//编写一段程序，从标准输入按行读取数据，其中每行都包含一个名字和两个整数。
//然后用printf() 打印一张表格，每行的若干列数据包括名字、两个整数和第一个整数除以第二个整数的结果，精确到小数点后三位。
//可以用这种程序将棒球球手的击球命中率或者学生的考试分数制成表格。

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Q1_1_21 {
	public static void main(String[] args){
		printTable();
	}

	private static void printTable(){
		while(StdIn.hasNextLine()){
			String name = StdIn.readString();
			int a = StdIn.readInt();
			int b = StdIn.readInt();
			StdOut.print("name:" + name + " " + "ScoreA:" + a + " " + "ScoreB:" + b + " ");
			StdOut.printf("%.3f", (double)a/b);
		}
	}
}

