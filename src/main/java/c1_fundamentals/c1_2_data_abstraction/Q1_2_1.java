package c1_fundamentals.c1_2_data_abstraction;


//编写一个Point2D的用例，从命令行接受一个整数N。
//在单位正方形内生成N个随机点，然后计算两点之间的最近距离。

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Q1_2_1 {
	
	public static double distance(int N){
		Point2D[] ps = new Point2D[N];
		StdDraw.setPenRadius(0.01);
		for(int i=0; i<N; i++){
			ps[i] = new Point2D(Math.random(), Math.random());
			ps[i].draw();
		}
		double dist = 1;
		for(int i=0; i<N-1; i++){
			for(int j=i; j<N-1; j++){
				if(ps[i].distanceTo(ps[j+1]) < dist)
					dist = ps[i].distanceTo(ps[j+1]);
			}
		}
		return dist;
	}
	
	public static void main(String[] args){
		int N = StdIn.readInt();
		StdOut.print(distance(N));
	}
}
