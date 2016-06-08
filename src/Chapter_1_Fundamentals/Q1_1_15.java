package Chapter_1_Fundamentals;

import edu.princeton.cs.algs4.StdOut;

//编写一个静态方法histogram()，接受一个整型数组a[] 和一个整数M 为参数并返回一个大小为M的数组，其中第i个元素的值为整数i在参数数组中出现的次数。
//如果a[]中的值均在0到M-1之间，返回数组中所有元素之和应该和a.length 相等。

public class Q1_1_15 {
	public static void main(String[] args){
		int[] a = {1, 3, 4, 2, 3, 6, 3};
		int M = 7;
		instogram(a, M);
	}
	public static int[] instogram(int[] a, int M){
		int[] b = new int[M];
		int n = 0;
		for(int i = 0; i < M; i++){
			for(int j = 0; j < a.length; j++){
				if(i == a[j]) n++;
			}
			b[i] = n;
			StdOut.print(b[i] + " ");
			n = 0;
		}
		return b;
	}
}
