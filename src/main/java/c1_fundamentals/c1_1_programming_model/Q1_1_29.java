package c1_fundamentals.c1_1_programming_model;


//等值键。
//为BinarySearch 类添加一个静态方法rank()，它接受一个键和一个整型有序数组（可能存在重复键）作为参数并返回数组中小于该键的元素数量，以及一个类似的方法count() 来返回数组中等于该键的元素的数量。
//注意：如果i 和j 分别是rank(key,a) 和count(key,a)的返回值，那么a[i..i+j-1] 就是数组中所有和key 相等的元素。

import edu.princeton.cs.introcs.StdOut;

public class Q1_1_29 {
	public static void main(String[] args){
		int[] a = {1, 1, 2 , 3 ,3 , 3 , 4, 5 ,6 ,7 };
		int i = rank(1, a);
		StdOut.println(i);
		int j = count(1, a);
		StdOut.println(j);
		for(int x = i; x < i+j; x++){
			StdOut.println(x);
		}
	}
	public static int rank(int key, int[] a){
		int n = 0;
		for(int i : a){
			if(a[i] < a[key])
				n++;
		}
		return n;
	}
	public static int count(int key, int[] a){
		int n = 0;
		for(int i : a){
			if(a[i] == a[key])
				n++;
		}
		return n;
	}
}
