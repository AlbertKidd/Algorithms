package c1_1_programming_model;

import java.util.ArrayList;

import edu.princeton.cs.algs4.StdOut;

public class Q1_1_28 {
	
	public static void main(String[] args){
		int[] a = {1, 1, 2, 3, 3, 45, 545, 645, 645, 675};
		StdOut.print(elimateDuplication(a));
	}
	
	public static ArrayList<Integer> elimateDuplication(int[] a){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int temp = a[0];
		list.add(a[0]);
		for(int i=0; i<a.length; i++){
			if(a[i] != temp){
				temp = a[i];
				list.add(temp);
			}
		}
		return list;
	}
}
