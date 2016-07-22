package c1_3_bags_queues_stacks;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class RandomBag<Item> implements Iterable<Item> {
	
	private int N;
	private Item[] bag;
	
	public RandomBag(){
		N = 0;
		bag = (Item[]) new Object[1];
	}
	
	public boolean isEmpty(){
		return N == 0;
	}
	
	public int size(){
		return N;
	}
	
	public void add(Item item){
		if(N == bag.length)
			resize(2 * bag.length);
		bag[N++] = item;
	}
	
	private void resize(int n){
		assert n >= N;
		Item[] temp = (Item[]) new Object[n];
		for(int i = 0; i < N; i++)
			temp[i] = bag[i];
		bag = temp;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<Item> {

		private int num;
		
		public ListIterator(){
			randomSort();
		}
		
		private Random rand = new Random();
		private void randomSort(){
			for(int i = 0; i < N; i++){
				int randomIndex = i + rand.nextInt(N - i);
				Item item = bag[i];
				bag[i] = bag[randomIndex];
				bag[randomIndex] = item;
			}
		}
		
		@Override
		public boolean hasNext() {
			return num < N;
		}

		@Override
		public Item next() {
			if(!hasNext())
				throw new NoSuchElementException();
			return bag[num++];
		}
		
	}
}
