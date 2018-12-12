package c1_fundamentals.c1_1_programming_model;

import common.Printer;
import common.RandomArray;
import edu.princeton.cs.algs4.*;

/**
 * 1.1.23
 * 为BinarySearch 的测试用例添加一个参数b：
 * true ,打印出标准输入中不在白名单上的值；
 * false ,则打印出标准输入中在白名单上的值。
 */
public class Q1_1_23 {
	
	public static void main(String[] args){
		StdOut.println("请输入白名单的大小：");
		int size = StdIn.readInt();
		int[] whiteList = RandomArray.generate(size);
		StdOut.println("白名单为：");
		Printer.print(whiteList);
		// readLine以读取下一行
		StdIn.readLine();
		printTest(whiteList, true);
		printTest(whiteList, false);
	}

	/**
	 * 打印标准输入数字中在/不在白名单上的值
	 * @param arr
	 * @param b
	 */
	private static void printTest(int[] arr, boolean b){
		StdOut.println("请输入需要查找的值，以空格分隔：");
		String s = StdIn.readLine();
		String[] split = s.split(" ");
		int[] keys = new int[split.length];
		for (int i = 0; i < split.length; i++){
			keys[i] = Integer.parseInt(split[i]);
		}
		StdOut.printf("以下输入值%s在白名单上：%n", b ? "不" : "");
		for (int key : keys){
			int index = BinarySearch.indexOf(arr, key);
			if ((index == -1 && b) || (index != -1 && !b)){
				StdOut.printf("%s ", key);
			}
		}
		StdOut.println();
	}
}
