package c1_fundamentals.c1_2_data_abstraction;


//修改BinarySearch,使用Counter统计在有查找中被检查的键的总数并在查找全部结束后打印该值。

import edu.princeton.cs.algorithms.Counter;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Q1_2_9 {
	public static void main(String[] args){
		int key = StdIn.readInt();
		int[] a = {1, 21, 25, 34, 46, 56, 67};
		Counter counter = new Counter("counter");
		rank(key, a, counter);
		StdOut.print(counter.tally());
	}
	
	public static int rank(int key, int[] a, Counter counter){
		int lo = 0;
		int hi = a.length;
		while(lo <= hi){
			int mid = lo + (hi - lo)/2;
			if(key < a[mid]){
				hi = mid - 1;
				counter.increment();
			}
				
			else if(key > a[mid]){
				lo = mid + 1;
				counter.increment();
			}
				
			else{
				counter.increment();
				return mid;
			}
		}
		counter.increment();
		return -1;
	}
}
