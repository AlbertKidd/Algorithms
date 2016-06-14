package Chapter_1_Fundamentals;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

//随机连接。
//编写一段程序，从命令行接受一个整数N 和double 值p（0 到1 之间）作为参数，在一个圆上画出大小为0.05 且间距相等的N 个点，然后将每对点按照概率p 用灰线连接。

public class Q1_1_31 {
	public static void main(String[] args){
		int N = StdIn.readInt();
		double p = StdIn.readDouble();
		randomLink(N,p);
	}
	public static void randomLink(int N, double p){
		StdDraw.setScale(0, 100);
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.circle(50, 50, 50);
		
		StdDraw.setPenColor();
		StdDraw.setPenRadius(0.05);
		double[][] a = new double[N][2];
		for(int i=0; i<N; i++){
			a[i][0] = 50*(1 - Math.cos(2*Math.PI*i/N));
			a[i][1] = 50*(1 + Math.sin(2*Math.PI*i/N));
			StdDraw.point(a[i][0], a[i][1]);
		}
		
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.setPenRadius(0.01);
		for(int i=0; i<N; i++){
			for(int j = i+1; j<N; j++){
				if(StdRandom.bernoulli(p))
					StdDraw.line(a[i][0], a[i][1], a[j][0], a[j][1]);
			}
			
		}
	}
}
