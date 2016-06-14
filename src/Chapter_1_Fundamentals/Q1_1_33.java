package Chapter_1_Fundamentals;

import edu.princeton.cs.algs4.StdOut;

//矩阵库。
//编写一个Matrix 库并实现以下API： 
/*
public class Matrix 
static double dot(double[] x, double[] y) //向量点乘 
static double[][] mult(double[][] a, double[][] b) //矩阵和矩阵之积 
static double[][] transpose(double[][] a) //转置矩阵 
static double[] mult(double[][] a, double[] x) //矩阵和向量之积 
static double[] mult(double[] y, double[][] a) //向量和矩阵之积 
编写一个测试用例，从标准输入读取矩阵并测试所有方法。
*/

public class Q1_1_33 {
	public static void main(String[] args){
		double[][] a = {{2, 3, 5},{5, 7, 8}};
		double[][] b = {{1, 2}, {5, 4}, {7, 8}};
		double[] x = {4, 7 ,9};
		double[] y = {9, 2, 3};
		dot(x, y);
		mult(a, b);
		transpose(a);
	}
	
	public static double dot(double[] x, double[] y){
		int min;
		double product = 0;
		if(x.length < y.length)
			min = y.length;
		else
			min = x.length;
		for(int i=0; i<min; i++)
			product += x[i]*y[i];
		StdOut.println(product);
		return product;
	}
	
	public static double[][] mult(double[][] a, double[][] b){
		int an = a.length;
		int am = a[0].length;
		int bn = b.length;
		int bm = b[0].length;
		if(am != bn)
			StdOut.print("无法进行矩阵相乘");
		double[][] c = new double[an][bm];
		for(int i=0; i<an; i++){
			for(int j=0; j<bm; j++){
				for(int k=0; k<am; k++){
					c[i][j] = a[i][k]*b[k][j];
					StdOut.print(c[i][j] + " ");
				}
				StdOut.println();
			}
		}
		return c;
	}
	
	public static double[][] transpose(double[][] a){
		int n = a.length;
		int m = a[0].length;
		double[][] b = new double[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				b[i][j] = a[j][i];
				StdOut.print(b[i][j] + " ");
			}
		StdOut.println();
		}
		return b;
	}
	
}
