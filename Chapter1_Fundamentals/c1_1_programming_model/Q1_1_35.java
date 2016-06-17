package c1_1_programming_model;

import edu.princeton.cs.algs4.StdOut;

/*
模拟掷骰子。
以下代码能够计算每种两个骰子之和的准确概率分布：
int SIDES = 6;  
double[] dist = new double[2*SIDES+1]; 
for (int i = 1; i <= SIDES; i++) 
	for (int j = 1; j <= SIDES; j++) 
		dist[i+j] += 1.0;  
for (int k = 2; k <= 2*SIDES; k++) 
	dist[k] /= 36.0;  
dist[i] 的值就是两个骰子之和为i 的概率。
用实验模拟N 次掷骰子，并在计算两个1 到 6 之间的随机整数之和时记录每个值的出现频率以验证它们的概率。
N 要多大才能够保证你的经验数据和准确数据的吻合程度达到小数点后三位？
*/

public class Q1_1_35 {
	public static void main(String[] args){
		int sides = 6;
		double[] dist = new double[2*sides + 1];
		for(int i=1; i<=sides; i++){
			for(int j=1; j<=sides; j++){
				dist[i+j] += 1;
			}
		}
		for(int k=2; k<=2*sides; k++){
			dist[k] /= sides*sides;
			StdOut.print(k + "——");
			StdOut.printf("%.2f",dist[k]);
			StdOut.println();
		}
	}
}
