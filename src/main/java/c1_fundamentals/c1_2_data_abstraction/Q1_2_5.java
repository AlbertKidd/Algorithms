package c1_fundamentals.c1_2_data_abstraction;


import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Q1_2_5 {
	
	public static void main(String[] args){
		String s = StdIn.readString();
		String t = StdIn.readString();
		StdOut.print(circularRotation(s, t));
	}
	
	public static boolean circularRotation(String s, String t){
		return (s+s).contains(t);
	}
}
