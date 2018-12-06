package c1_fundamentals.c1_1_programming_model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 编写一段程序，从标准输入按行读取数据，其中每行都包含一个名字和两个整数。
 * 然后用printf() 打印一张表格，每行的若干列数据包括名字、两个整数和第一个整数除以第二个整数的结果，精确到小数点后三位。
 * 可以用这种程序将棒球球手的击球命中率或者学生的考试分数制成表格。
 */
public class Q1_1_21 {

	public static void main(String[] args){
		StdOut.print("请输入人数：");
		int num = StdIn.readInt();
		StdIn.readLine();
		printTable(num);
	}

	private static void printTable(int num){
		String[] arr = new String[num];
		for (int i = 0; i < num; i++){
			StdOut.printf("请输入第%s行数据(姓名 成绩A 成绩B)：", i + 1);
			String s = StdIn.readLine();
			arr[i] = s;
		}
		printHead();
		for (String s : arr){
			String[] split = s.split(" ");
			printRow(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2]));
		}
	}

	/**
	 * 打印表头
	 */
	private static void printHead(){
		StdOut.println("姓名      成绩A   成绩B   命中率");
	}

	/**
	 * 打印每一行的数据
	 * @param name
	 * @param scoreA
	 * @param scoreB
	 */
	private static void printRow(String name, int scoreA, int scoreB){
		StdOut.printf("%-4s      %5s   %5s   %6.3f%n", name, scoreA, scoreB, (double)scoreA/scoreB);
	}
}

