package c1_fundamentals.c1_1_programming_model;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.Color;

/**
 * 1.1.31
 * 随机连接。
 * 编写一段程序，从命令行接受一个整数N和double值p（0到1之间）作为参数，
 * 在一个圆上画出大小为0.05且间距相等的N个点，然后将每对点按照概率p用灰线连接。
 * 
 */
public class Q1_1_31 {

	public static void main(String[] args){
		StdOut.println("请输入点的数量N：");
		int n = StdIn.readInt();
		StdOut.println("请输入连接概率p：");
		double p = StdIn.readDouble();
		randomLink2(n, p);
	}

	public static void randomLink2(int n, double p){
		// 指定面板大小
		StdDraw.setScale(0, 120);

		// 绘制圆，圆心坐标为60，60
		int radius = 50;
		StdDraw.circle(60, 60, radius);

		// 绘制点
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.05);
		double radian =  2 * Math.PI / n;
		double[][] points = new double[n][2];
		for (int i = 0; i < n; i++){
			double x = 60 + Math.sin(i * radian) * radius;
			double y = 60 - Math.cos(i * radian) * radius;
			points[i] = new double[]{x, y};
			StdDraw.point(x, y);
		}

		// 绘制连接线
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.setPenRadius();
		for (int i = 0; i < n; i++){
			for (int j = i + 1; j < n; j++){
				if (StdRandom.bernoulli(p)){
					StdDraw.line(points[i][0], points[i][1], points[j][0], points[j][1]);
				}
			}
		}
	}

}
