package c1_fundamentals.c1_2_data_abstraction;


import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdOut;

public class Q1_2_10 {
	
	public static void main(String[] args){
		VisualCounter counter = new VisualCounter(10, 5);
		counter.increment();
		counter.increment();
		counter.reduction();
	}		
}
class VisualCounter{
	int clickNum;
	int num;
	int N;
	int max;
	public VisualCounter(int N, int max){
		num = 0;
		this.N = N;
		this.max = max;
//		StdDraw.setScale();
	}
	void increment(){
		num++;
		clickNum++;
		if(num > max)
			StdOut.println("计数器超过最大计数值");
		if(clickNum > N)
			StdOut.println("计数器超过最大点击数");
		StdDraw.clear();
		StdDraw.text(100, 100, String.valueOf(num));
	}
	void reduction(){
		num--;
		clickNum++;
		if(num < -max)
			StdOut.println("计数器超过最大计数值");
		if(clickNum > N)
			StdOut.println("计数器超过最大点击数");
		StdDraw.clear();
		StdDraw.text(100, 100, String.valueOf(num));
	}
}
