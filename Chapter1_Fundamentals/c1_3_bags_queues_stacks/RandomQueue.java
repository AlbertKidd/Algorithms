package c1_3_bags_queues_stacks;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class RandomQueue<Item> implements Iterable<Item>{
	private int N;
	private int first;
	private Item[] list;
	
	public RandomQueue(){
		N = 0;
		first = 0;
		list = (Item[])new Object[2];
	}
	
	public boolean isEmpty(){
		return N == 0;
	}
	
	public void enqueue(Item item){
		if(N == list.length)
			resize(2 * list.length);
		list[N] = item;
		N++;
	}
	
	private Random rand = new Random();
	
	public Item dequeue(){
		int randIndex = rand.nextInt(N - 1);
		Item temp = list[randIndex];
		list[randIndex] = list[N - 1];
		list[N - 1] = null;
		N--;
		if(N > 0 && N == list.length/4)
			resize(list.length/2);
		return temp;
	}
	
	public Item sample(){
		int randIndex = rand.nextInt(N - 1);
		Item temp = list[randIndex];
		list[randIndex] = list[N - 1];
		list[N - 1] = temp;
		return temp;
	}
	
	private void resize(int max){
		assert max >= N;
		Item[] temp = (Item[])new Object[max];
		for(int i = 0; i < N; i++){
			temp[i] = list[i + first];
		}
		list = temp;
		first = 0;
	}
	
	@Override
	public Iterator<Item> iterator(){
		return new ArrayIterator();
	}
	
	private class ArrayIterator implements Iterator<Item>{
		private int i = 0;
		
		public ArrayIterator(){
			randomSort();
		}
		
		private void randomSort(){
			for(int i = 0; i < N; i++){
				int randIndex = i + rand.nextInt(N - i);
				Item item = list[i];
				list[i] = list[randIndex];
				list[randIndex] = item;
			}
		}
		
		public boolean hasNext(){
			return i < N;
		}
		public Item next(){
			if(!hasNext())
				throw new NoSuchElementException();
			return list[i++];
		}
	}
}
