package Chapter_1_Fundamentals;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Q1_1_11 {
	public static void main(String[] args){
		boolean[][] b = new boolean[StdIn.readInt()][StdIn.readInt()];
		initial(b);
		StdOut.print("+++++ ");
		for(int x=0; x<getColums(b); x++){
			StdOut.print("column" + x + " ");
		}
		StdOut.println();
		for(int i=0; i<b.length; i++){
			StdOut.print("line" + i + " ");
			for(int j=0; j<b[i].length; j++){
				StdOut.print("   " + trans(b[i][j]) + "    ");
			}
			StdOut.println();
		}
				
	}
	private static boolean[][] initial(boolean[][] b){
		for(int i=0; i<b.length; i++){
			for(int j=0; j<b[i].length; j++)
				b[i][j] = StdRandom.bernoulli();
		}
		return b;
	}
	private static String trans(boolean b){
		if(b)
			return "*";
		else
			return "-";
	}
	private static int getColums(boolean[][] b){
		int columns = 0;
		for(int i=0; i<b.length; i++){
			if(b[i].length > columns)
				columns = b[i].length;
		}
		return columns;
	}
}
