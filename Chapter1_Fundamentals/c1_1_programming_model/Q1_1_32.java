package c1_1_programming_model;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

//直方图。
//假设标准输入流中含有一系列double 值。
//编写一段程序，从命令行接受一个整数N 和两个double 值l 和r。
//将(l，r) 分为N 段并使用StdDraw 画出输入流中的值落入每段的数量的直方图。

public class Q1_1_32 {
	public static void main(String[] args){
		double[] a = new double[100];
		for(int i=0; i<a.length; i++){
			a[i] = StdRandom.uniform() * 3;
		}
		StdDraw.setScale(0, 5);
		StdDraw.setPenColor(StdDraw.BLACK);
		histogram(10, 0.5, 1.0, a);
	}
	public static void histogram(int N, double l, double r, double[] input){
		double[] x = new double[N];
		x[0] = l/N;		
		for(int i=1; i<N; i++){
			x[i] = x[i-1] + (l+r)/N;
			StdOut.print(x[i] + " ");
		}
		
		int[] y = new int[N];
		
		for(int i=0; i<N; i++){
			int count = 0;
			for(int j=0; j<input.length; j++){
				if(input[j]>x[i] && input[j]<x[i]+r/N)
					count++;
			}
			y[i] = count;
			StdOut.print(y[i] + " ");
			StdDraw.filledRectangle(x[i] + r/(2*N), y[i]/2, r/(2*N), y[i]/2);
		}
	}
}
