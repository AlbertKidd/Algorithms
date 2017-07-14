package c1_fundamentals.c1_3_bags_queues_stacks;

import java.util.NoSuchElementException;

public class GeneralizedQueue<Item> {
	private int N;
	private Item[] q;
	private int first,last;
	
	public GeneralizedQueue(){
		N = 0;
		q = (Item[]) new Object[1];
		first = 0;
		last = 0;
	}
	
	public boolean isEmpty(){
		return N == 0;
	}
	
	public void insert(Item x){
		if(N == q.length)
			resize(2 * N);
		q[last++] = x;
		N++;
	}
	
	public Item delete(int k){
		if(k >= N)
			throw new NoSuchElementException();
		resize(N);
		Item item = q[k - 1];
		for(int i = 0; i < N; i++){
			if(i == N - 1)
				q[i] = null;
			else if(i > k - 1)
				q[i] = q[i + 1];
		}
		N--;
		return item;
	}
	
	private void resize(int max){
		assert max >= N;
		Item[] temp = (Item[])new Object[max];
		for(int i = 0; i < N; i++)
			temp[i] = q[i + first];
		q = temp;
		first = 0;
		last = N;
	}
}
