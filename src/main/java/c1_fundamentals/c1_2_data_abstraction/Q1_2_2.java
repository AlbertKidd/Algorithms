package c1_fundamentals.c1_2_data_abstraction;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

//编写一个Interval1D的用例，从命令行接受一个整数N。
//从标准输入中读取N个间隔（每个间隔由一对double值定义）并打印出所有相交的间隔对。

public class Q1_2_2 {
	public static void main(String[] args){
		int N = StdIn.readInt();
		printInterval(N);
	}
	
	public static void printInterval(int N){
		Interval1D[] is = new Interval1D[N];
		for(int i=0; i<N; i++){
			double x = 100 * Math.random();
			double y = 100 * Math.random() + x;
			is[i] = new Interval1D(x, y);
			StdOut.println(is[i].toString());
		}
		for(int i=0; i<N-1; i++){
			for(int j=i+1; j<N; j++){
				if(is[i].intersects(is[j]))
					StdOut.println(i + "," + j);
			}
		}
	}
}
