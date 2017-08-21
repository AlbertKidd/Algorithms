package c1_fundamentals.c1_1_programming_model;


//为BinarySearch 的测试用例添加一个参数：
//+ ,打印出标准输入中不在白名单上的值；-，则打印出标准输入中在白名单上的值。

import edu.princeton.cs.introcs.StdOut;

public class Q1_1_23 {
	
	public static void main(String[] args){
		int[] whiteList = {1, 5, 23, 34, 44, 45, 54, 56, 57, 75, 94};
		rank(44, whiteList, 0, whiteList.length - 1, false);
	}
	
	public static int rank(int key, int[] a, int lo, int hi, boolean b){
		if(lo > hi){
			if(b)
				StdOut.println(key);
			return -1;
		}
		int mid = lo + (hi - lo)/2;
		if(key > a[mid])
			return rank(key, a, mid + 1, hi, b);
		else if(key < a[mid])
			return rank(key, a, lo, mid - 1, b);
		else{
			if(!b)
				StdOut.println(key);
			return key;
		}
	}
}
