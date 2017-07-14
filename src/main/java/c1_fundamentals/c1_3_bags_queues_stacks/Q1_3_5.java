package c1_fundamentals.c1_3_bags_queues_stacks;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Q1_3_5 {
	public static void main(String[] args){
		StdOut.print(toBinary(StdIn.readInt()));
	}
	public static String toBinary(int N){
		Stack<Integer> stack = new Stack<Integer>();
		while(N > 0){
			stack.push(N % 2);
			N /= 2;
		}
		return stack.toString();
	}
}
