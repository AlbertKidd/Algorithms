package c1_fundamentals.c1_1_programming_model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * 1.1.22
 * 使用1.1.6.4节中的rank() 递归方法重新实现BinarySearch 并跟踪该方法的调用。
 * 每当该方法被调用时，打印出它的参数lo 和hi 并按照递归的深度缩进。
 * 提示：为递归方法添加一个参数来保存递归的深度。
 */
public class Q1_1_22 {

	public static void main(String[] args){
		StdOut.println("请输入初始数组的大小：");
		int size = StdIn.readInt();
		int[] array = initArray(size);
		StdOut.printf("初始数组为：%s%n", Arrays.toString(array));
		StdOut.println("请输入要查找的整数：");
		int num = StdIn.readInt();
		rank(array, num);
	}

	/**
	 * 根据传入的数字构造一个对应大小的数组，其中元素为递增排列
	 * @param size
	 * @return
	 */
	public static int[] initArray(int size){
		int[] arr = new int[size];
		arr[0] = StdRandom.uniform(10);
		for (int i = 1; i < size; i++){
			arr[i] = arr[i - 1] + StdRandom.uniform(1, 10);
		}
		return arr;
	}

	/**
	 * 二分查找，打印查找深度
	 * @param arr
	 * @param key
	 * @return
	 */
	private static int rank(int[] arr, int key){
		int low = 0;
		int high = arr.length;
		int depth = 0;
		while (high >= low){
			StdOut.printf("当前深度：%3s，下限位：%3s，上限位：%3s%n", depth++, low, high);
			int mid = (high + low) / 2;
			if (key == arr[mid]){
				StdOut.printf("%s在数组中为第%s位%n", key, mid);
				return mid;
			}else if (key > arr[mid]){
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		StdOut.printf("数组中不存在此值：%s%n", key);
		return -1;
	}
}
