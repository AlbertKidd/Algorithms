package c1_fundamentals.c1_1_programming_model;

import common.Printer;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 1.1.15
 * 编写一个静态方法histogram()，接受一个整型数组a[] 和一个整数M 为参数并返回一个大小为M的数组，
 * 其中第i个元素的值为整数i在参数数组中出现的次数。
 *
 * 如果a[]中的值均在0到M-1之间，返回数组中所有元素之和应该和a.length 相等。
 */
public class Q1_1_15 {

	public static void main(String[] args){
		int[] arr = init();
		StdOut.println("请输入结果数组的大小：");
		int size = StdIn.readInt();
		int[] result = histogram(arr, size);
		StdOut.print("结果数组为：");
		Printer.print(result);
		int plusResult = 0;
		for (int i : result){
			plusResult += i;
		}
		StdOut.printf("结果数组元素之和为：%s", plusResult);

	}

	/**
	 *
	 * @return
	 */
	private static int[] init(){
		StdOut.println("请输入初始数组的大小：");
		int size = StdIn.readInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++){
			arr[i] = StdRandom.uniform(8);
		}
		StdOut.println("生成的数组为：");
		Printer.print(arr);
		return arr;
	}

	/**
	 * 接受一个整型数组arr[] 和一个整数size为参数并返回一个大小为M的数组，其中第i个元素的值为整数i在参数数组中出现的次数
	 * @param arr
	 * @param size
	 * @return
	 */
	private static int[] histogram(int[] arr, int size){

		int[] result = new int[size];
		for (int i = 0; i < size; i++){
			for (int j = 0; j < size; j++){
				if (arr[j] == i){
					result[i]++;
				}
			}
		}
		return result;
	}
}
