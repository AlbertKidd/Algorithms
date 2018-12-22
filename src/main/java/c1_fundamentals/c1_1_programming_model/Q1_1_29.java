package c1_fundamentals.c1_1_programming_model;

import common.BinarySearchEx;
import common.RandomArray;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 1.1.29
 * 等值键。
 * 为BinarySearch类添加一个静态方法rank()，
 * 它接受一个键和一个整型有序数组（可能存在重复键）作为参数并返回数组中小于该键的元素数量，
 * 以及一个类似的方法count()来返回数组中等于该键的元素的数量。
 * 注意：如果i和j分别是rank(key,a)和count(key,a)的返回值，那么a[i..i+j-1]就是数组中所有和key相等的元素。
 */
public class Q1_1_29 {

	public static void main(String[] args){
		StdOut.println("请输入初始数组的大小：");
		int[] arr = RandomArray.generate(StdIn.readInt(), true, true);
		StdOut.printf("生成的数组为：%n%s%n", Arrays.toString(arr));
		StdOut.println("请输入需要搜索的数值：");
		int value = StdIn.readInt();
		StdOut.printf("rank函数结果为: %s%n", BinarySearchEx.rank(arr, value));
		StdOut.printf("count函数结果为: %s%n", BinarySearchEx.count(arr, value));
	}

}
