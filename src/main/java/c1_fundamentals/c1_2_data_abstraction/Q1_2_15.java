package c1_fundamentals.c1_2_data_abstraction;


//文件输入。
//基于String的split()方法实现In中的静态方法readInts()。

import edu.princeton.cs.algs4.In;

public class Q1_2_15 {
	public static int[] readInts(){
		In in = new In();
		String input = in.readAll();
		String[] nums = input.split("\\s+");
		int[] ints = new int[nums.length];
		for(int i=0; i<ints.length; i++)
			ints[i] = Integer.parseInt(nums[i]);
		return ints;
	}
}
