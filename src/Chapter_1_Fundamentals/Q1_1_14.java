package Chapter_1_Fundamentals;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Q1_1_14 {
	public static void main(String[] args){
		int n = StdIn.readInt();
		lg2(n);
	}
	
	public static int lg2(int n){
		int a = 0;
		while(n/2 > 0){
			a++;
			n /= 2;
		}
		StdOut.print(a);
		return a;
	}
}
