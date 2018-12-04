package c1_fundamentals.c1_1_programming_model;


import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;

//删除重复元素
//修改BinarySearch类中的测试用例来删去排序之后白名单中的所有重复元素
public class Q1_1_28 {
	
	public static void main(String[] args){
		int[] a = {1, 1, 2, 3, 3, 45, 545, 645, 645, 675};
		StdOut.print(eliminateDuplication(a));
	}
	
	private static ArrayList<Integer> eliminateDuplication(int[] a){
		ArrayList<Integer> list = new ArrayList<>();
		int temp = a[0];
		list.add(a[0]);
		for(int i : a){
			if(i != temp){
				temp = i;
				list.add(temp);
			}
		}
		return list;
	}

}
