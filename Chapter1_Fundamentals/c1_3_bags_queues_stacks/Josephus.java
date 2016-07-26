package c1_3_bags_queues_stacks;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Josephus {
	public static void main(String[] args){
		int N = StdIn.readInt(),
			M = StdIn.readInt();
		
		Queue<Integer> q = new Queue<Integer>();
		for(int i = 0; i < N; i++)
			q.enqueue(new Integer(i));
		
		int k = 0;
		while(!q.isEmpty()){
			int x = q.dequeue();
			
			if(++k % M == 0)
				StdOut.print(x + " ");
			else
				q.enqueue(x);
		}
	}
}
