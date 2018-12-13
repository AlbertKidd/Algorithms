package c1_fundamentals.c1_1_programming_model;

import common.BinarySearchEx;
import common.RandomArray;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1.1.28
 * 删除重复元素
 * 修改BinarySearch类中的测试用例来删去排序之后白名单中的所有重复元素
 */
public class Q1_1_28 {
	
	public static void main(String[] args){
		StdOut.println("请输入初始数组的大小");
		int size = StdIn.readInt();
		int[] arr = RandomArray.generate(size, true, true);
		StdOut.printf("生成的数组为：%s%n", Arrays.toString(arr));
		StdOut.printf("去重后的数组为：%s", Arrays.toString(eliminateDuplication(arr)));
	}

	/**
	 * 使用二分查找对数组元素进行去重
	 * @param arr
	 * @return
	 */
	public static int[] eliminateDuplication(int[] arr){
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++){
			int index = BinarySearchEx.indexOf(arr, arr[i], i + 1, arr.length - 1);
			if (index == -1){
				list.add(arr[i]);
			}
		}
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++){
			result[i] = list.get(i);
		}
		return result;
	}
	
}
