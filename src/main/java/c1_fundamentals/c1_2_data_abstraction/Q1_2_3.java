package c1_fundamentals.c1_2_data_abstraction;


//编写一个Interval2D的用例，从命令行接受参数N，min和max。
//生成N个随机的2D间隔，其宽和高均匀地分布在单位正方形中的min和max中间。
//用StdDraw画出它们并打印出相交的间隔对的数量以及有包含关系的间隔对数量。

import edu.princeton.cs.algorithms.Counter;
import edu.princeton.cs.algorithms.Interval1D;
import edu.princeton.cs.algorithms.Interval2D;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Q1_2_3 {
	public static void main(String[] args){
		int N = StdIn.readInt();
		double min = StdIn.readDouble();
		double max = StdIn.readDouble();
		StdOut.print(printInterval(N, min, max));
	}
	
	public static int printInterval(int N, double min, double max){
		double gap = max - min;
		Interval2D[] is = new Interval2D[N];
		for(int i=0; i<N; i++){
			double x1 = min + gap*Math.random();
			double x2 = x1 + (max-x1)*Math.random();
			Interval1D ix = new Interval1D(x1, x2);
			double y1 = min + gap*Math.random();
			double y2 = y1 + (max-y1)*Math.random();
			Interval1D iy = new Interval1D(y1, y2);
			is[i] = new Interval2D(ix, iy);
			is[i].draw();
		}
		Counter c1 = new Counter("all");
		for(int i=0; i<N-1; i++){
			for(int j=i+1; j<N; j++){
				if(is[i].intersects(is[j]))
					c1.increment();
			}
		}
		return c1.tally();
	}
}
